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

public class XMLReaderLocationDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Location.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Location");
			List<Location> locList = new ArrayList<Location>();
			for (int i=0;i<nodeList.getLength();i++) {
				locList.add(getLocation(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Location loc : locList) {
				System.out.println(loc.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Location getLocation(Node node) {
		Location loc = new Location();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		loc.setLocationID(getTagValue("LocationID", element));
		loc.setLocName(getTagValue("locName", element));
		loc.setLocationCode(getTagValue("locationCode", element));
		loc.setIsActive(getTagValue("isActive", element));
		loc.setCustomerID(getTagValue("CustomerID", element));
		loc.setAddressStreet1(getTagValue("addressstreet1", element));
		loc.setAddressStreet2(getTagValue("addressstreet2", element));
		loc.setCity(getTagValue("city", element));
		loc.setState(getTagValue("state", element));
		loc.setPostalCode(getTagValue("postalCode", element));
		loc.setRegion(getTagValue("region", element));
		loc.setLocation_contact_name(getTagValue("location_contact_name", element));
		loc.setLocPhone(getTagValue("locPhone", element));
		loc.setLocFaxNumber(getTagValue("locFaxNumber", element));
		loc.setLocEmail(getTagValue("locEmail", element));
		
		}
		
		return loc;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
