package com.momai.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Employee {

	public static void main(String[] args) {
		parseXml("D:/employees.xml");

	}

	public static void parseXml(String fileName) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File(fileName));

			// 获得文档根元素对象
			Element root = document.getDocumentElement();
			System.out.println(root.getNodeName());

			// 获得文档根元素下一级子元素所有元素
			NodeList nodeList = root.getChildNodes();
			if (null != root) {
				for (int i = 0; i < nodeList.getLength(); i++) {
					Node child = nodeList.item(i);

					// 输出child的属性
//					System.out.println(child);
//
//					if (child.getNodeType() == Node.ELEMENT_NODE) {
//						System.out.println(child.getAttributes().getNamedItem("email").getNodeValue());
//					}
//
//					for (Node node = child.getFirstChild(); node != null; node = node.getNextSibling()) {
//						if ("name".equals(node.getNodeName())) {
//							System.out.println(node.getFirstChild().getNodeValue());
//						}
//					}

					for (Node node = child.getFirstChild(); node != null; node = node.getNextSibling()) {
						if ("sex".equals(node.getNodeName())) {
							System.out.println(node.getFirstChild().getNodeValue());
						}
					}
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
