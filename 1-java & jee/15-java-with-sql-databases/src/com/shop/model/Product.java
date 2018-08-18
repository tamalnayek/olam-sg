package com.shop.model;

import java.util.Date;

public class Product {

	private int id;
	private String name;
	private double price;
	private Date make_date;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getMake_date() {
		return make_date;
	}

	public void setMake_date(Date make_date) {
		this.make_date = make_date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", make_date=" + make_date+ ", description=" + description + "]";
	}

}
