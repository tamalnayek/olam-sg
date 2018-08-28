package com.bank.db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource; //  connection pool lib

/*
 * 
 * Oracle
 * 
 *  driver   : oracle.jdbc.driver.OracleDriver
 *  url      : jdbc:oracle:thin:@localhost:1521/XE
 *  user     : 
 *  password : 
 *  
 *  
 * SQL server
 * 
 *  
 * 
 */
public class ConnectionFactory {

	private static DataSource dataSource;

	public static DataSource getDataSource() {
		if (dataSource == null) {

			Properties properties = new Properties();

//			try {
//				FileInputStream fis = new FileInputStream("./db.properties");
//				properties.load(fis);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}

			BasicDataSource basicDataSource = new BasicDataSource();
			basicDataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			basicDataSource.setUrl("jdbc:sqlserver://localhost:1433;databaseName=bank_db");
			basicDataSource.setUsername("sa");
			basicDataSource.setPassword("shhhmssql1");
			basicDataSource.setInitialSize(2);
			basicDataSource.setMaxActive(10);
			dataSource = basicDataSource;
		}
		return dataSource;
	}

}
