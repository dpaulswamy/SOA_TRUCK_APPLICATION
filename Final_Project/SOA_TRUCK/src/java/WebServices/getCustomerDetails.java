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
@WebService(serviceName = "getCustomerDetails")
public class getCustomerDetails {

    /**
     * This is a sample web service operation
     */
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
}
    
