package com.util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtility {
	static Connection con;
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		System.out.println("Register a driver");
		con = DriverManager.getConnection("jdbc:odbc:shiva","system","shiva123");
		if(con != null)
			System.out.println("established");
		else
			System.out.println("not established");
			
		return con;
	}
	public static void release(Connection con2) throws SQLException {
		// TODO Auto-generated method stub
//		long x = 0xCAF__F;
//		List<? extends Serializable> l = new ArrayList();
//		long a = 0b1;
		if(con != null)
			con.close();
	}
	public static void release(Connection con, Statement st, ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		if(rs != null)
			rs.close();
		if(st != null)
			st.close();
		if(con != null)
			con.close();
	}
}
