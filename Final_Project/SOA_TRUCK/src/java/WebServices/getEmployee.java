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
@WebService(serviceName = "getEmployee")
public class getEmployee {

    /**
     * This is a sample web service operation
     */
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
}
