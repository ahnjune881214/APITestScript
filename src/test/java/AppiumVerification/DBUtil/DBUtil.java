/*******************************************************************************
 * Copyright (c) 2017 by QA Team of Wemakeprice. All Rights Reserved.
 *
 * Permission to use, copy, modify, and distribute this software and its documentation for
 * educational, research, and not-for-profit purposes, without fee and without a signed licensing agreement,
 * is hereby granted, provided that the above copyright notice appears in all copies, modifications, and distributions.
 *******************************************************************************/

package AppiumVerification.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBUtil {
	public static void main(String[] args) throws Exception {
		getConnection();
		createTable();
	}
	
	public static void createTable() throws Exception {
		try {
			Connection con = getConnection();
			
			String sql = "CREATE TABLE IF NOT EXISTS MOBILE_DEAL_OVERLAP"
					+ "(id int NOT NULL "
					+ "AUTO_INCREMENT, "
					
					+ "DEAL_ID INT NULL DEFAULT NULL, "
					+ "DEAL_NAME VARCHAR(255) NOT NULL DEFAULT '', "
					+ "DEAL_URL VARCHAR(255) NOT NULL DEFAULT '', "
					
					+ "TIME TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP, "
					+ "PRIMARY KEY(id))";
			
			PreparedStatement create = con.prepareStatement(sql);
			create.executeUpdate();
		} catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("Function complete.");
		}
	}
	
	public static Connection getConnection() {
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost/API";
			String username = "root";
			String password = "1q2w3e";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
		} catch(Exception e){
			System.out.println(e);
		}
		return null;
	}
}
