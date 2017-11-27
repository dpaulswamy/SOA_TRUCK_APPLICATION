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

public class XMLReaderTruckDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Trucks.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Truck");
			List<Truck> truList = new ArrayList<Truck>();
			for (int i=0;i<nodeList.getLength();i++) {
				truList.add(getTruck(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Truck tru : truList) {
				System.out.println(tru.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Truck getTruck(Node node) {
		Truck tru = new Truck();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		tru.setTruckNo(getTagValue("TruckNo", element));
		tru.setMake(getTagValue("Make", element));
		tru.setYear(getTagValue("Year", element));
		tru.setModel(getTagValue("Model", element));
		tru.setLicensePlateNo(getTagValue("LicensePlateNo", element));
		tru.setEmployeeID(getTagValue("EmployeeID", element));
		tru.setColor(getTagValue("Color", element));
		tru.setVIN(getTagValue("VIN", element));
		}
		
		return tru;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
