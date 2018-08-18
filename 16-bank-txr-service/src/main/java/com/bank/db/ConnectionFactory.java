package com.bank.db;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource; //  connection pool lib

/*
 * 
 * Oracle
 * 
 *  driver   : oracle.jdbc.driver.OracleDriver
 *  url      : jdbc:oracle:thin:@localhost:1521/XE
 *  user     : scott
 *  password : tiger
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
