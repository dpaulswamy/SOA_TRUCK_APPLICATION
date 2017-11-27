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

public class XMLReaderDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Comments.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Comment");
			List<Comment> comList = new ArrayList<Comment>();
			for (int i=0;i<nodeList.getLength();i++) {
				comList.add(getComment(nodeList.item(i)));
				//System.out.println(comList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Comment com : comList) {
				System.out.println(com.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Comment getComment(Node node) {
		Comment com = new Comment();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		com.setCommentID(getTagValue("CommentID", element));
		com.setCommentName(getTagValue("CommentName", element));
		com.setCustomerID(getTagValue("CustomerID", element));
		com.setTransactionID(getTagValue("TransactionID", element));
		com.setCommentTime(getTagValue("CommentTime", element));
		
		}
		
		return com;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
