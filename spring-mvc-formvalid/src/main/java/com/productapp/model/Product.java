package com.productapp.model;

public class Product {
 private String productName;
 private Integer productId;
 private double ratings;
 private double price;
 private String brand;
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public double getRatings() {
	return ratings;
}
public void setRatings(double ratings) {
	this.ratings = ratings;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
@Override
public String toString() {
	return "Product [productName=" + productName + ", productId=" + productId + ", ratings=" + ratings + ", price="
			+ price + ", brand=" + brand + "]";
}


}
