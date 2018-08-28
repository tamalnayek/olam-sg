package com.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

import com.mysql.jdbc.Driver;

public class ConnectionFactory {

	private static BasicDataSource dataSource;

	static {
//		// step-1 : register 'jdbc-driver' with jdbc-api
//		try {
//			DriverManager.registerDriver(new Driver());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/products_catalog");
		dataSource.setUsername("root");
		dataSource.setPassword("root1234");
		dataSource.setMaxActive(5);
		dataSource.setMaxIdle(2);

	}

	public static Connection getConnection() throws SQLException {
//
//		// step-2 : create connection with url , user and password
//		String url = "jdbc:mysql://localhost:3306/products_catalog";
//		String user = "root";
//		String password = "root1234";
//
//		return DriverManager.getConnection(url, user, password);
		return dataSource.getConnection();

	}

}
