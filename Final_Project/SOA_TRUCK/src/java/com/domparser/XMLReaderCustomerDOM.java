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

public class XMLReaderCustomerDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Customer.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Customer");
			List<Customer> custList = new ArrayList<Customer>();
			for (int i=0;i<nodeList.getLength();i++) {
				custList.add(getCustomer(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Customer cust : custList) {
				System.out.println(cust.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Customer getCustomer(Node node) {
		Customer cust = new Customer();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		cust.setCustomerID(getTagValue("CustomerID", element));
		cust.setCustomerTitle(getTagValue("CustomerTitle", element));
		cust.setBusinessName(getTagValue("BusinessName", element));
		cust.setLocationID(getTagValue("LocationID", element));
		cust.setBillingAddress(getTagValue("BillingAddress", element));
		cust.setCity(getTagValue("City", element));
		cust.setState(getTagValue("State", element));
		cust.setPostalCode(getTagValue("PostalCode", element));
		cust.setCountry(getTagValue("Country", element));
		cust.setPhoneNumber(getTagValue("PhoneNumber", element));
		cust.setCellNumber(getTagValue("CellNumber", element));
		cust.setOtherNumber(getTagValue("OtherNumber", element));
		cust.setFaxNumber(getTagValue("FaxNumber", element));
		cust.setEmailAddress(getTagValue("EmailAddress", element));
		cust.setCompanyName(getTagValue("CompanyName", element));
		cust.setContactName(getTagValue("ContactName", element));
		cust.setAlternateContactName(getTagValue("AlternateContactName", element));
		cust.setDateEntered(getTagValue("DateEntered", element));
		cust.setCustomerType(getTagValue("CustomerType", element));
		
		}
		
		return cust;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
