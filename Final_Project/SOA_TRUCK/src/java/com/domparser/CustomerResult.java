package com.domparser;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connector.Connector;

public class CustomerResult {
	
	Connector conn = new Connector();
	private Statement statement = null;
	
	public ResultSet getResultSet() throws Exception {
		
		ResultSet rs = null;
		
		try
		{
			statement = conn.getConnection().createStatement();
			String sql = "select * from customer;";
			rs = statement.executeQuery(sql);
			System.out.println(rs);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return rs;
		
	}

}
