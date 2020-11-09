package com.jumplus.eCommerce.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	private static final String URL = "jdbc:mysql://localhost:3306/Group6Store"; // Windows
	//private static final String URL = "jdbc:mysql://localhost:3306/shop?serverTimezone=EST5EDT"; // Mac or Linux
	private static final String USERNAME = "root";
	private static final String PASSWORD = "tbDeveloper24"; // Windows: root, Mac: Root@123
	
	// connect to database method
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
//			System.out.println("Connected");
			
		} catch (SQLException e) {
			
			System.out.println("Could not connect");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	public static void main(String[] args) {
		
		Connection conn = ConnectionManager.getConnection();
		try {
			conn.close();
			
			System.out.println("Connection was closed");
			
		} catch (SQLException e) {
			
			System.out.println("Couldn't close connection");
		}
		
	}
	
}
