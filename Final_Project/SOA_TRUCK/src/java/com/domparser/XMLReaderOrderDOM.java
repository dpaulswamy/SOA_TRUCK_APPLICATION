package com.domparser;

import java.io.File;
import java.io.IOException;
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

public class XMLReaderOrderDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Orders.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Order");
			List<Order> ordList = new ArrayList<Order>();
			for (int i=0;i<nodeList.getLength();i++) {
				ordList.add(getOrder(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Order ord : ordList) {
				System.out.println(ord.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Order getOrder(Node node) {
		Order ord = new Order();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		ord.setOrderID(getTagValue("OrderID", element));
		ord.setOrderDate(getTagValue("OrderDate", element));
		ord.setCustomerID(getTagValue("CustomerID", element));
		ord.setEmployeeID(getTagValue("EmployeeID", element));
		ord.setTruckID(getTagValue("TruckID", element));
		ord.setIsSpecial(getTagValue("isSpecial", element));
		ord.setPurchaseOrderNumber(getTagValue("PurchaseOrderNumber", element));
		ord.setOrderTotalAmount(getTagValue("OrderTotalAmount", element));
		}
		
		return ord;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
