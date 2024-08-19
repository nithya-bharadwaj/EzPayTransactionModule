package com.ezpay.transaction.utility;
import java.sql.*;

public class DBConnection {
	
	    public static void main(String[] args) {
	        // Replace these with your Oracle database details
	        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Update URL, port, and SID as needed
	        String user = "system"; // Replace with your Oracle username
	        String password = "natwest123"; // Replace with your Oracle password

	        try {
	            // Load the Oracle JDBC driver
	            Class.forName("oracle.jdbc.driver.OracleDriver");

	            // Establish the connection
	            Connection connection = DriverManager.getConnection(url, user, password);

	            System.out.println("Connection successful!");

	            // Close the connection
	            connection.close();
	        } catch (ClassNotFoundException e) {
	            System.out.println("Oracle JDBC Driver not found.");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Connection failed.");
	            e.printStackTrace();
	        }
	    }
	}



