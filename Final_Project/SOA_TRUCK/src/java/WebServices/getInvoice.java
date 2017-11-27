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
@WebService(serviceName = "getInvoice")
public class getInvoice {

    /**
     * This is a sample web service operation
     */
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
}
