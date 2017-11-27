/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author dpaul
 */
@WebService(serviceName = "TruckApplication")
public class getComment {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getComment")
    public String Comment() {
        
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select CommentID, CommentName from comments;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("CommentID") + "\t" + rs.getString("CommentName") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
@WebMethod(operationName = "getMaxTran")
    public String MaxTran() {
        
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query1 = "select TransactionID, TranxAmt from transaction;";
            PreparedStatement st = con.prepareStatement(query1);
            rs = st.executeQuery();
           while(rs.next())
           {
                details = details + rs.getString("TransactionID") + "\t" + rs.getInt("TranxAmt") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
     @WebMethod(operationName = "getCustomer")
    public String hello() {
        
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select billingaddress, contactname from customer c left outer join location l on c.Customerid=l.Customerid where l.locationid = \"L101\";";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("billingaddress") + "\t" + rs.getString("contactname");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getCustomerLocationID")
    public String CustomerLocation() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select CustomerID, ContactName from customer union select Locationid, locName from location;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("CustomerID") + "\t" + rs.getString("ContactName") + "\t" + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getPostalCode")
    public String PostalCode() {
        
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select postalcode, state from (select postalcode, state from location) as postalcode;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("postalcode") + "\t" + rs.getString("state") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
        
    }
    
    @WebMethod(operationName = "getSubQuery")
    public String SubQuery() {
        
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select LocationID,isActive,postalCode from location where CustomerID in (select CustomerID from invoice where InvoiceID in (\"INV101\",\"INV102\"));";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("LocationID") + "\t" + rs.getString("isActive") + "\t" + rs.getString("postalcode") + "\t" + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getCustomerDetails")
    public String CustomerDetails() {
        
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select * from customer;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("CustomerID") + "\t" + rs.getString("CustomerTitle") + "\t" + rs.getString("BusinessName") + "\t" +
                        rs.getString("LocationID") + "\t" + rs.getString("BillingAddress") + "\t" + rs.getString("City") + "\t" + rs.getString("State") +
                         "\t" + rs.getString("PostalCode") + "\t" + rs.getString("Country") + "\t" + rs.getString("PhoneNumber") + "\t" + rs.getString("CellNumber") +
                         "\t" + rs.getString("OtherNumber") + "\t" + rs.getString("FaxNumber") + "\t" + rs.getString("EmailAddress") + "\t" + rs.getString("CompanyName") +
                         "\t" + rs.getString("ContactName") + "\t" + rs.getString("AlternateContactName") + "\t" + rs.getString("DateEntered") + "\t" + rs.getString("CustomerType") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getInnerJoin")
    public String InnerJoin() {
        
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select * from orders;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("OrderID") + "\t" + rs.getString("OrderDate") + "\t" + rs.getString("CustomerID") + 
                        "\t" + rs.getString("EmployeeID") + "\t" + rs.getString("TruckID") + "\t" + rs.getString("isSpecial") + 
                        "\t" + rs.getString("PurchaseOrderNumber") + "\t" + rs.getString("OrderTotalAmount") + "\t" + rs.getString("TransactionID") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getLike")
    public String Like() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select CustomerID, ContactName, City, State, Country, PhoneNumber, EmailAddress from customer where billingaddress like '%south%';";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("CustomerID") + "\t" + rs.getString("ContactName") + "\t" + rs.getString("City") + "\t" + rs.getString("State") + "\t" +
                        rs.getString("Country") + "\t" + rs.getString("PhoneNumber") + "\t" + rs.getString("EmailAddress") + "\t" + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getInlineView")
    public String InLine() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select ExpenseID, AmountSpent from (select ExpenseID, AmountSpent from expense) as ExpenseID;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("ExpenseID") + "\t" + rs.getString("AmountSpent") + "\t" + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getTransaction")
    public String Transaction() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select TransactionID, priceID, UnitPrice, DriverPrice from transaction;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("TransactionID") + "\t" + rs.getString("priceID") + "\t" + rs.getString("UnitPrice") +  "\t" + rs.getString("DriverPrice") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getAddress")
    public String Address() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select addressstreet1, addressstreet2 from location;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("addressstreet1") + "\t" + rs.getString("addressstreet2") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
     @WebMethod(operationName = "getTruck")
    public String Truck() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select TruckID, Make, Year, Model, LicensePlateNo, EmployeeID, Color, VIN from truck;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("TruckID") + "\t" + rs.getString("Make") + "\t" + rs.getString("Year") + "\t" + 
                        rs.getString("Model") + "\t" + rs.getString("LicensePlateNo") + "\t" + rs.getString("EmployeeID") + "\t" + 
                        rs.getString("Color") + "\t" + rs.getString("VIN") + "\t" + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getPrice")
    public String Price() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
                String query = "select priceID, price, locationNameFrom, locationNameTo from pricing;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("priceID") + "\t" + rs.getString("price") + "\t" + rs.getString("locationNameFrom") + "\t" + rs.getString("locationNameTo") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getPayment")
    public String Payment() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select PaymentID, PaymentMethod, PaymentAmount from payment p inner join orders o on p.OrderID = o.OrderID where OrderTotalAmount = \"1500\";";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("PaymentID") + "\t" + rs.getString("PaymentMethod") + "\t" + rs.getInt("PaymentAmount") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getExpense")
    public String Expense() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select * from expense;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("ExpenseID") + "\t" + rs.getString("EmployeeID") + "\t" + rs.getString("ExpenseType") + "\t" +
                        rs.getString("PurposeofExpense") + "\t" + rs.getInt("AmountSpent") + "\t" + rs.getString("Description") + "\t" +
                        rs.getDate("DatePurchased") + "\t" + rs.getDate("DateSubmitted") + "\t" + rs.getInt("AdvanceAmount") + "\t" +
                        rs.getString("PaymentMethod") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getEmployee")
    public String Employee() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select * from employee;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("EmployeeID") + "\t" + rs.getString("FirstName") + "\t" + rs.getString("LastName") + "\t" +
                        rs.getString("Email") + "\t" + rs.getInt("Extension") + "\t" + rs.getInt("HomePhone") + "\t" + rs.getInt("CellPhone") +
                         "\t" + rs.getString("JobTitle") + "\t" + rs.getInt("SocialSecurityNumber") + "\t" + rs.getInt("DriverLicenseNumber") + "\t" + rs.getString("Address") +
                         "\t" + rs.getString("City") + "\t" + rs.getString("State") + "\t" + rs.getInt("PostalCode") + "\t" + rs.getString("BirthDate") +
                         "\t" + rs.getString("DateHired") + "\t" + rs.getInt("Salary") + "\t" + rs.getString("Notes") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getInvoice")
    public String Invoice() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select InvoiceID, OrderID, OrderTotalAmount from invoice inner join customer on customer.CustomerID = invoice.CustomerID where City = \"Chicago\";";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("InvoiceID") + "\t" + rs.getString("OrderID") + "\t" + rs.getString("OrderTotalAmount") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getPricing")
    public String Pricing() {
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select * from pricing";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("priceID") + "\t" + rs.getInt("locationIDFrom") + "\t" + rs.getInt("locationIDTo") + "\t"
                        + rs.getInt("price") + "\t" + rs.getInt("locationCodeFrom") + "\t" + rs.getInt("locationCodeTo") + "\t"
                        + rs.getString("locationNameFrom") + "\t" + rs.getString("locationNameTo") + "\t" + rs.getString("CustomerID") + "\t"
                        + rs.getString("type") + "\t" + rs.getString("type1") + "\t" + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
    
    @WebMethod(operationName = "getCommentDetails")
    public String CDetails() {
       ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select * from comments;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("CommentID") + "\t" + rs.getString("CommentTime") + "\t" + rs.getString("CommentName") + "\t" + rs.getString("CustomerID") + "\t" + rs.getString("TransactionID") + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
}
