package com.jumplus.eCommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jumplus.eCommerce.connection.ConnectionManager;
import com.jumplus.eCommerce.model.Item;


public class ItemDAOImp implements ItemDAO {
	private Connection conn = ConnectionManager.getConnection();
	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
        List<Item> items = new ArrayList<Item>();
		
		try(Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from inventory"); ){
			
			while(rs.next()) {
				String name = rs.getString(1);
				String code = rs.getString(2);
				Double price = rs.getDouble(3);
				int quantity=rs.getInt(4);
			
				// add to list
				Item item = new Item(name,code,price,quantity);
				items.add(item);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return items;
	
	}

	@Override
	public Item getItemByName(String name) {
		// TODO Auto-generated method stub
		 Item item = null;
			
			try(PreparedStatement pstmt = conn.prepareStatement("select * from inventory where name = ?")) {
				
				pstmt.setString(1, name);
				
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					String name1 = rs.getString(1);
					String code = rs.getString(2);
					Double price = rs.getDouble(3);
					int quantity=rs.getInt(4);
					
					
					item = new Item(name1, code, price, quantity);
				}
				
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			
			return item;
		
	}

	@Override
	public Item getItemByCode(String code) {
		// TODO Auto-generated method stub
		 Item item = null;
			
			try(PreparedStatement pstmt = conn.prepareStatement("select * from inventory where code = ?")) {
				
				pstmt.setString(1, code);
				
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					String name = rs.getString(1);
					String code1 = rs.getString(2);
					Double price = rs.getDouble(3);
					int quantity=rs.getInt(4);
					
					
					item = new Item(name, code1, price, quantity);
				}
				
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			
			return item;
		
	}

	@Override
	public boolean addItems(Item item) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into inventory values(?,?,?,?)");
			
			pstmt.setString(1, item.getName());
			pstmt.setString(2, item.getCode());
			pstmt.setDouble(3, item.getPrice());
			pstmt.setLong(4, item.getQuantity());
			
			
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
