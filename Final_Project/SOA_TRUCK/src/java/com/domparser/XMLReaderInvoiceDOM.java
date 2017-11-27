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

public class XMLReaderInvoiceDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Invoice.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Invoice");
			List<Invoice> invList = new ArrayList<Invoice>();
			for (int i=0;i<nodeList.getLength();i++) {
				invList.add(getInvoice(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Invoice inv : invList) {
				System.out.println(inv.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Invoice getInvoice(Node node) {
		Invoice inv = new Invoice();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		inv.setInvoiceID(getTagValue("InvoiceID", element));
		inv.setInvoiceDate(getTagValue("InvoiceDate", element));
		inv.setCustomerID(getTagValue("CustomerID", element));
		inv.setOrderTotalAmount(getTagValue("OrderTotalAmount", element));
		inv.setOrderID(getTagValue("OrderID", element));
		inv.setDueDate(getTagValue("DueDate", element));
		
		}
		
		return inv;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
