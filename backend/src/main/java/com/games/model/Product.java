package com.games.model;


import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKey;

@Entity
public class Product {

	




	@Id @GeneratedValue(strategy = GenerationType.AUTO )

private int id;
private String productname;
private double price;
private Integer quantity;
private String description;
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}

public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public String getDescription() {
	return description;
}
public String getProductname() {
	return productname;
}


public void setProductname(String productname) {
	this.productname = productname;
}


public void setDescription(String description) {
	this.description = description;
}

}