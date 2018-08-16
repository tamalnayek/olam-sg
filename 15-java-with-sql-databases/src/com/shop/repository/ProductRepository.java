package com.shop.repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.shop.db.ConnectionFactory;
import com.shop.model.Product;

public class ProductRepository {

	public boolean save(Product product) throws SQLException {

		Connection con = ConnectionFactory.getConnection();
		String sql = "insert into products_catalog.PRODUCTS(id,name,price,description) values (?,?,?,?)";

		CallableStatement callableStatement=con.prepareCall("call <procedure>");
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, product.getId());
		ps.setString(2, product.getName());
		ps.setDouble(3, product.getPrice());
		ps.setString(4, product.getDescription());

		int c = ps.executeUpdate();
		con.close();

		if (c == 1)
			return true;
		else
			return false;
		
		
		
	}

	//
	public List<Product> findAll() throws SQLException {

		List<Product> products = new ArrayList<Product>();
		//
		Connection con = ConnectionFactory.getConnection();

		//
		String sql = "SELECT * FROM products_catalog.PRODUCTS";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Product product = new Product();
			product.setId(rs.getInt("id"));
			product.setName(rs.getString("name"));
			product.setPrice(rs.getDouble("price"));
			product.setDescription(rs.getString("description"));
			products.add(product);
		}
		con.close();

		return products;
	}

}
