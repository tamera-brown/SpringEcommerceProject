package com.jumplus.eCommerce.dao;

import java.sql.Timestamp;
import java.util.List;

import com.jumplus.eCommerce.model.Invoice;

public interface InvoiceDAO {
public List<Invoice> getAllInvoices();
	
	public Invoice getInvoiceByUserName(String username);
	
	public Invoice getInvoiceByDate(Timestamp date);
	
	public boolean addInvoice(Invoice invoice);
}
