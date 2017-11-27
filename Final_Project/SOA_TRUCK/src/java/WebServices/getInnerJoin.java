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
@WebService(serviceName = "getInnerJoin")
public class getInnerJoin {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getInnerJoin")
    public String InnerJoin() {
        
        ResultSet rs = null;
        String details = ""; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query = "select c.CustomerID,o.CustomeriD,co.CustomeriD from customer c inner join orders o on c.CustomerID=o.CustomerID inner join comments co on c.CustomerID=co.CustomerID;";
            PreparedStatement st = con.prepareStatement(query);
            rs = st.executeQuery();
            while(rs.next())
            {
                details = details + rs.getString("c.CustomerID") + "\n" + rs.getString("o.CustomerID") + "\n" + rs.getString("co.CustomerID") + "\t" + "\n";
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
}
