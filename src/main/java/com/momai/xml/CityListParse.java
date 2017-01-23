package com.momai.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CityListParse {

	//	private static String conf = "D:/city.xml";
	private static String conf = "D:/configuration.xml";

	// Document是XML在内存中的一个镜像, 获取了Document就可以通过内存的操作来实现对XML的操作
	private static Document doc = null;

	public static void main(String[] args) {
		// 从DocumentBuilderFactory中获取一个DocumentBuilder的实例
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			doc = db.parse(new File(conf));

			// Element代表XML中的一个标签对, 可用于获取属性值
			Element element = doc.getDocumentElement();
			System.out.println(element + ", Root Element : " + element.getTagName());

			// 通过标签名来获取多个节点
			NodeList nodeList = doc.getElementsByTagName("Service");
			System.out.println(nodeList + ", NodeList length : " + nodeList.getLength());

			// 获取第一个Service节点
			Node node = nodeList.item(0);
			System.out.println("First Node : " + node.getNodeName());

			// 通过getAttributes方法来获取一个NamedNodeMap实例, 该实例包含标签属性值
			NamedNodeMap attrs = node.getAttributes();
			for (int i = 0; i < attrs.getLength(); i++) {
				Node attr = attrs.item(i);
				System.out.println(attr.getNodeName() + " " + attr.getNodeValue() + " " + attr.getNodeType());
			}

			NodeList childNodes = node.getChildNodes();
			for (int i = 0; i < childNodes.getLength(); i++) {
				Node child = childNodes.item(i);
				if (child instanceof Element) {
					System.out.println(child.getNodeName() + " : " + child.getFirstChild().getNodeValue());
				}
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
	}

}
