package com.jumplus.eCommerce.dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.jumplus.eCommerce.connection.ConnectionManager;
import com.jumplus.eCommerce.model.Invoice;
import com.jumplus.eCommerce.model.Item;


public class InvoiceDAOImp implements InvoiceDAO{
	private Connection conn = ConnectionManager.getConnection();
	@Override
	public List<Invoice> getAllInvoices() {
		
		// TODO Auto-generated method stub
		List<Invoice> invoices = new ArrayList<Invoice>();
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from invoice"); ){
					
					while(rs.next()) {
						int invoiceNum  = rs.getInt(1);
						Timestamp date = rs.getTimestamp(2);
						String custName = rs.getString(3);
						@SuppressWarnings("unchecked")
						List<Item> items=(List<Item>) rs.getArray("item");
						// add to list
						Invoice invoice=new Invoice(invoiceNum, date, custName, items);
						invoices.add(invoice);
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				return invoices;
			
			}

		
	

	@Override
	public Invoice getInvoiceByUserName(String username) {
		// TODO Auto-generated method stub
	
		Invoice invoice = null;
		
		try(PreparedStatement pstmt = conn.prepareStatement("select * from invoice where username = ?")) {
			
			pstmt.setString(1, username);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int invoiceNum  = rs.getInt(1);
				Timestamp date = rs.getTimestamp(2);
				String custName = rs.getString(3);
				@SuppressWarnings("unchecked")
				List<Item> items=(List<Item>) rs.getArray("item");
				// add to list
				invoice=new Invoice(invoiceNum, date, custName, items);
				
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return invoice;
	
	}
		
	

	@Override
	public Invoice getInvoiceByDate(Timestamp date) {
		// TODO Auto-generated method stub
Invoice invoice = null;
		
		try(PreparedStatement pstmt = conn.prepareStatement("select * from invoice where username = ?")) {
			
			pstmt.setTimestamp(1, date);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int invoiceNum  = rs.getInt(1);
				Timestamp date1= rs.getTimestamp(2);
				String custName = rs.getString(3);
				@SuppressWarnings("unchecked")
				List<Item> items=(List<Item>) rs.getArray("item");
				// add to list
				invoice=new Invoice(invoiceNum, date1, custName, items);
				
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return invoice;
	
	}

	@Override
	public boolean addInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into invoice values(?,?,?,?)");
			
			pstmt.setInt(1, invoice.getInvoiceNum());
			pstmt.setTimestamp(2, invoice.getDate());
			pstmt.setString(3, invoice.getCustName());
			pstmt.setArray(4, (Array) invoice.getItems());
			
			
			
			int insert = pstmt.executeUpdate();
			
			if(insert > 0) {
				return true;
			}
			
			pstmt.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	
	}

}
