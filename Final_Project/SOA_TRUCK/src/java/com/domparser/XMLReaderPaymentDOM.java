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

public class XMLReaderPaymentDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Payment.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Payment");
			List<Payment> payList = new ArrayList<Payment>();
			for (int i=0;i<nodeList.getLength();i++) {
				payList.add(getPayment(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Payment pay : payList) {
				System.out.println(pay.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Payment getPayment(Node node) {
		Payment pay = new Payment();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		pay.setPaymentID(getTagValue("PaymentID", element));
		pay.setTransactionID(getTagValue("TransactionID", element));
		pay.setOrderID(getTagValue("OrderID", element));
		pay.setPaymentMethod(getTagValue("PaymentMethod", element));
		pay.setPaymentAmount(getTagValue("PaymentAmount", element));
		pay.setPaymentDate(getTagValue("PaymentDate", element));
		pay.setCheckNumber(getTagValue("CheckNumber", element));
		pay.setCreditCard(getTagValue("CreditCard", element));
		pay.setCreditCardNumber(getTagValue("CreditCardNumber", element));
		pay.setCardholdersName(getTagValue("CardholdersName", element));
		pay.setCreditCardExpDate(getTagValue("CreditCardExpDate", element));
		pay.setCreditCardAuthorizationNumber(getTagValue("CreditCardAuthorizationNumber", element));
		}
		
		return pay;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
