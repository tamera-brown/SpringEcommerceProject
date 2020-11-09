package com.jumplus.eCommerce.model;


public class Item {

	private String name;
	private String code;
	private double price;
	private int quantity;
	
	public Item() {
		this("N/A","N/A",0.00,20);
	}

	public Item(String name, String code, double price, int quantity) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	@Override
	public String toString() {
		return "Item [name=" + name + ", code=" + code + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
