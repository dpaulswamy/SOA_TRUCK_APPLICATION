package connector;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
    try{
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/soa","root","Natsu@123");
        return connection;
    }catch(Exception e) {
    	e.printStackTrace();
    }
    return null;
	}
}
