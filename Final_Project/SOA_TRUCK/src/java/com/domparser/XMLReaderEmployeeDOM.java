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

public class XMLReaderEmployeeDOM {

	public static void main(String[] args) {
		String filepath = "C:/Users/dpaul/workspace/Truck/XML_XSD_DTD/Employee.xml";
		File xmlFile = new File(filepath);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nodeList = doc.getElementsByTagName("Employee");
			List<Employee> empList = new ArrayList<Employee>();
			for (int i=0;i<nodeList.getLength();i++) {
				empList.add(getEmployee(nodeList.item(i)));
				//System.out.println(invList);
				//System.out.println(nodeList.getLength());
			}
			
			
			for (Employee emp : empList) {
				System.out.println(emp.toString());
			}
		} catch (SAXException | ParserConfigurationException | IOException e1) {
			e1.printStackTrace();
		}

	}
	
	private static Employee getEmployee(Node node) {
		Employee emp = new Employee();
		if (node.getNodeType() == Node.ELEMENT_NODE){
		Element element = (Element) node;
		emp.setEmployeeID(getTagValue("EmployeeID", element));
		emp.setFirstName(getTagValue("FirstName", element));
		emp.setLastName(getTagValue("LastName", element));
		emp.setEmail(getTagValue("Email", element));
		emp.setExtension(getTagValue("Extension", element));
		emp.setHomePhone(getTagValue("HomePhone", element));
		emp.setCellPhone(getTagValue("CellPhone", element));
		emp.setJobTitle(getTagValue("JobTitle", element));
		emp.setSocialSecurityNumber(getTagValue("SocialSecurityNumber", element));
		emp.setDriverLicenseNumber(getTagValue("DriverLicenseNumber", element));
		emp.setAddress(getTagValue("Address", element));
		emp.setCity(getTagValue("City", element));
		emp.setState(getTagValue("State", element));
		emp.setPostalCode(getTagValue("PostalCode", element));
		emp.setBirthDate(getTagValue("BirthDate", element));
		emp.setDateHired(getTagValue("DateHired", element));
		emp.setSalary(getTagValue("Salary", element));
		emp.setNotes(getTagValue("Notes", element));
		
		}
		
		return emp;
	}
	
	private static String getTagValue(String tag, Element element) {
		NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
		Node node = (Node) nodeList.item(0);
		return node.getNodeValue();
	}
	
}
