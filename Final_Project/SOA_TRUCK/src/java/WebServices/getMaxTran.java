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
@WebService(serviceName = "getMaxTran")
public class getMaxTran {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getMaxTran")
    public String MaxTran() {
        
        ResultSet rs = null;
        String details = "Maximum Transaction Amount is "; 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa", "root", "Natsu@123");
            
            String query1 = "select max(tranxamt) from transaction;";
            PreparedStatement st = con.prepareStatement(query1);
            rs = st.executeQuery();
           while(rs.next())
           {
                details = details + rs.getInt("max(TranxAmt)");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return details;
    }
}
