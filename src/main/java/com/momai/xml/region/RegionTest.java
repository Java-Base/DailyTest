package com.momai.xml.region;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.momai.xml.model.CityModel;
import com.momai.xml.model.ProvinceModel;



public class RegionTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String driver = "com.mysql.jdbc.Driver";
		String userName = "develop";
		String passwrod = "123456";
		String url = "jdbc:mysql://121.41.101.210:3306/appserver?useUnicode=true&amp;characterEncoding=utf8";
		// String url =
		// "jdbc:mysql://localhost/test?useUnicode=true&amp;characterEncoding=GBK";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			// 1. 加载驱动程序
			Class.forName(driver);
			// com.mysql.jdbc.Driver driver1 = new com.mysql.jdbc.Driver();
			// new com.mysql.jdbc.Driver();
			// 2. 创建数据库连接对象
			conn = DriverManager.getConnection(url, userName, passwrod);

			System.out.println("连接MySQL数据库成功");

			// 得到读取xml文件的数据
			List<ProvinceModel> provinceList = getXmlCityData();
			for (int i = 0; i < provinceList.size(); i++) {
				ProvinceModel pModel = provinceList.get(i);
				// 创建Statment对象, 插入省名称数据
				pst = conn.prepareStatement("insert into t_region(pid, region, level) values(?, ?, ?)");
				pst.setInt(1, 0);
				pst.setString(2, pModel.getRegion());
				pst.setInt(3, 1);
				pst.executeUpdate();
				// pst.setDate(3, (java.sql.Date) new Date());

				// 首先根据省名称得到对应的regionId
				pst = conn.prepareStatement("select regionId from t_region");
				rs = pst.executeQuery();
				int regionId = 0;
				while (rs.next()) {
					regionId = rs.getInt("regionId");
				}
				// System.out.println(regionId);

				// 然后对每个省插入对应的城市数据
				List<CityModel> cityList = pModel.getCityList();
				for (int j = 0; j < cityList.size(); j++) {
					CityModel cModel = cityList.get(j);
					pst = conn.prepareStatement("insert into t_region(pid, region, level) values(?, ?, ?)");
					pst.setInt(1, regionId);
					pst.setString(2, cModel.getRegion());
					pst.setInt(3, 2);
					pst.executeUpdate();
				}
			}
			// // 3. 创建Statement对象
			// stat = conn.createStatement();
			//
			// // 4. 调用Statement对象执行相应的sql语句
			// rs = stat.executeQuery("select * from dept");
			//
			// while(rs.next()) {
			// System.out.println(rs.getString("deptno"));
			// }

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
					rs = null;
				}
				if (pst != null) {
					pst.close();
					pst = null;
				}
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static List<ProvinceModel> getXmlCityData() {
		List<ProvinceModel> cityList = null;
		ProvinceModel pModel = null;
		try {
			File cityFile = new File("D:/city.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(cityFile);

			// 得到所有的dict信息的list
			NodeList nodeList = doc.getElementsByTagName("dict");
			int listLength = nodeList.getLength();

			cityList = new ArrayList<ProvinceModel>();
			for (int i = 0; i < listLength; i++) {
				// 得到单个的dict数据
				Node node = nodeList.item(i);
				// 得到单个dict数据的子节点[array和string]
				NodeList pList = node.getChildNodes();

				// 得到省市名称
				String cityValue = pList.item(3).getFirstChild().getNodeValue();
				pModel = new ProvinceModel();
				pModel.setRegion(cityValue);

				// 得到单个省的城市列表
				NodeList cList = pList.item(1).getChildNodes();
				List<CityModel> cModelList = new ArrayList<CityModel>();
				for (int j = 0; j < cList.getLength(); j++) {
					Node cityNode = cList.item(j);
					CityModel cModel = null;
					if (cityNode instanceof Element) {
						cModel = new CityModel();
						cModel.setRegion(cityNode.getFirstChild().getNodeValue());
						cModelList.add(cModel);
					}
				}
				pModel.setCityList(cModelList);
				cityList.add(pModel);
			}

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cityList;
	}

}
