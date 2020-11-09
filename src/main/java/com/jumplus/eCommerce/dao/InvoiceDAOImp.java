package com.jumplus.eCommerce.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.jumplus.eCommerce.connection.ConnectionManager;
import com.jumplus.eCommerce.model.Invoice;

public class InvoiceDAOImp implements InvoiceDAO{
	private Connection conn = ConnectionManager.getConnection();
	@Override
	public List<Invoice> getAllInvoices() {
		return null;
		// TODO Auto-generated method stub

		
	}

	@Override
	public Invoice getInvoiceByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice getInvoiceByDate(Timestamp date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return false;
	}

}
