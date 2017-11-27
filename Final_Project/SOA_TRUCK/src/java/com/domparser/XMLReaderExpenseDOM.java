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

public class XMLReaderExpenseDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Expense.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Expense");
			List<Expense> expList = new ArrayList<Expense>();
			for (int i=0;i<nodeList.getLength();i++) {
				expList.add(getExpense(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Expense exp : expList) {
				System.out.println(exp.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Expense getExpense(Node node) {
		Expense exp = new Expense();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		exp.setExpenseID(getTagValue("ExpenseID", element));
		exp.setEmployeeID(getTagValue("EmployeeID", element));
		exp.setExpenseType(getTagValue("ExpenseType", element));
		exp.setPurposeofExpense(getTagValue("PurposeofExpense", element));
		exp.setAmountSpent(getTagValue("AmountSpent", element));
		exp.setDescription(getTagValue("Description", element));
		exp.setDatePurchased(getTagValue("DatePurchased", element));
		exp.setDateSubmitted(getTagValue("DateSubmitted", element));
		exp.setAdvanceAmount(getTagValue("AdvanceAmount", element));
		exp.setPaymentMethod(getTagValue("PaymentMethod", element));
		
		}
		
		return exp;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
