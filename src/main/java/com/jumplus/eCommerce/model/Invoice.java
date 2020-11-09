package com.jumplus.eCommerce.model;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Invoice {

	private int invoiceNum;
	private Timestamp date;
	private String CustName;
	private List<Item> items;
	
	public Invoice() {
		this(-999,Timestamp.from(Instant.now()),"N/A",new ArrayList<Item>());
	}

	public Invoice(int invoiceNum, Timestamp date, String custName, List<Item> items) {
		super();
		this.invoiceNum = invoiceNum;
		this.date = date;
		CustName = custName;
		this.items = items;
	}

	public int getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(int invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public String getCustName() {
		return CustName;
	}

	public void setCustName(String custName) {
		CustName = custName;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceNum=" + invoiceNum + ", date=" + date + ", CustName=" + CustName + ", items=" + items
				+ "]";
	}
	
}
