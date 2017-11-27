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

public class XMLReaderPricingDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Pricing.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Pricing");
			List<Pricing> priList = new ArrayList<Pricing>();
			for (int i=0;i<nodeList.getLength();i++) {
				priList.add(getPricing(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Pricing pri : priList) {
				System.out.println(pri.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Pricing getPricing(Node node) {
		Pricing pri = new Pricing();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		pri.setPriceID(getTagValue("PriceID", element));
		pri.setLocationIDFrom(getTagValue("locationIDFrom", element));
		pri.setLocationIDTo(getTagValue("locationIDTo", element));
		pri.setPrice(getTagValue("price", element));
		pri.setLocationCodeFrom(getTagValue("locationCodeFrom", element));
		pri.setLocationCodeTo(getTagValue("locationCodeTo", element));
		pri.setLocationNameFrom(getTagValue("locationNameFrom", element));
		pri.setLocationNameTo(getTagValue("locationNameTo", element));
		pri.setCustomerID(getTagValue("CustomerID", element));
		pri.setType(getTagValue("type", element));
		pri.setType1(getTagValue("type1", element));
		
		}
		
		return pri;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
