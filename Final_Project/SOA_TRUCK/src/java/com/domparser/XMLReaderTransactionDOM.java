package com.domparser;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
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

import connector.Connector;

public class XMLReaderTransactionDOM {
	
	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Transaction.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Transaction");
			List<Transaction> traList = new ArrayList<Transaction>();
			for (int i=0;i<nodeList.getLength();i++) {
				traList.add(getTransaction(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			for (Transaction tra : traList) {
				System.out.println(tra.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Transaction getTransaction(Node node) {
		Transaction tra = new Transaction();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		tra.setTransactionID(getTagValue("TransactionID", element));
		tra.setOrderID(getTagValue("OrderID", element));
		tra.setPriceID(getTagValue("PriceID", element));
		tra.setTranxDate(getTagValue("TranxDate", element));
		tra.setTranxDesc(getTagValue("TranxDesc", element));
		tra.setTranxAmt(getTagValue("TranxAmt", element));
		tra.setMake(getTagValue("Make", element));
		tra.setModel(getTagValue("Model", element));
		tra.setYear(getTagValue("Year", element));
		tra.setEmployeeID(getTagValue("EmployeeID", element));
		tra.setTruckNo(getTagValue("TruckNo", element));
		tra.setDiscount(getTagValue("Discount", element));
		tra.setQuantity(getTagValue("Quantity", element));
		tra.setUnitPrice(getTagValue("UnitPrice", element));
		tra.setDriverPrice(getTagValue("DriverPrice", element));
		tra.setVIN(getTagValue("VIN", element));
		tra.setRunNumber(getTagValue("RunNumber", element));
		tra.setSpecial(getTagValue("Special", element));
		tra.setRate(getTagValue("Rate", element));
		tra.setSurcharge(getTagValue("Surcharge", element));
		tra.setTx_priceID(getTagValue("Tx_priceID", element));
		tra.setAmount(getTagValue("Amount", element));
		tra.setQty(getTagValue("Qty", element));
		tra.setDescription(getTagValue("Description", element));
		tra.setTx_date(getTagValue("Tx_date", element));
		tra.setTx_car_make(getTagValue("Tx_car_make", element));
		tra.setTx_car_model(getTagValue("Tx_car_model", element));
		tra.setTx_car_year(getTagValue("Tx_car_year", element));
		tra.setTx_car_VIN(getTagValue("Tx_car_VIN", element));
		
		}
		
		return tra;
		
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
	Connector connect = new Connector();
	private Statement statement = null;
	public void InsertData() throws Exception {
		try{
			statement = connect.getConnection().createStatement();
			String sql = "Load XML LOCAL INFILE 'C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Transaction.xml' INTO TABLE transaction ROWS IDENTIFIED BY '<Transaction>';";
			statement.execute(sql);
			System.out.println("XML data is pushed into the database");
			statement.close();
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}	
}

