package com.cohart20.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	int product_id;
	String product_name;
	String product_detail;
	String user_name;
	public Product() {
		
	}
	
	public Product(int product_id, String product_name, String product_detail, String user_name) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_detail = product_detail;
		this.user_name = user_name;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_detail() {
		return product_detail;
	}
	public void setProduct_detail(String product_detail) {
		this.product_detail = product_detail;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

}
