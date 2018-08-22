package com.shop.pc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRODUCT")
public class Product {

	@Id
	@Column(name = "ID")
	private int id;
	@Column(name = "NAME", nullable = false, updatable = false)
	private String name;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "IMAGE")
	private String image;
	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name = "DESCRIPTION")
	@Lob
	private String description;
	@OneToMany(mappedBy = "product")
	private List<Review> reviews; // 1 - M
	
	
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	
	

}
