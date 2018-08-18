package com.patterns.creational;

class ConnectionFactory {

	public static String getConnection(String dbType) {
		// reads configuration files ( txt,xml,properties,yml)
		if (dbType.equals("oracle")) {
			// ...
			return "oracle";
		}
		if (dbType.equals("mssql")) {
			return "ms-sql";
		}
		if (dbType.equals("redis")) {
			return "redis";
		}
		return null;
	}

}

public class Factory_Ex {

	public static void main(String[] args) {

//		module-1
		// ---------------------------------------------------
		String con = ConnectionFactory.getConnection("oracle");
		String redisCon = ConnectionFactory.getConnection("redis");
		// ---------------------------------------------------

//		module-2
		// ---------------------------------------------------
		String msCon = ConnectionFactory.getConnection("mssql");
		// ---------------------------------------------------

//		module-3
		// ---------------------------------------------------

		// ---------------------------------------------------

	}

}
