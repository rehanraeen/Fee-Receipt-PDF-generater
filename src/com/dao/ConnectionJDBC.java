package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {

	public static Connection con;

	public static Connection conn() {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FeeDetail", "root", "root");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
