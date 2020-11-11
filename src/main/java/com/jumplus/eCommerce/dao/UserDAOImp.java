package com.jumplus.eCommerce.dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jumplus.eCommerce.connection.ConnectionManager;
import com.jumplus.eCommerce.model.Invoice;
import com.jumplus.eCommerce.model.User;
import com.jumplus.eCommerce.model.User.ROLE;


public class UserDAOImp implements UserDAO {

	private Connection conn = ConnectionManager.getConnection();
	
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		try(Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select * from users"); ){
					
					while(rs.next()) {
						String username = rs.getString(1);
						String name = rs.getString(2);
						String password = rs.getString(3);
						String email=rs.getNString(4);
						ROLE role=User.ROLE.valueOf(rs.getString("role"));
						@SuppressWarnings("unchecked")
						List<Invoice> invoice=(List<Invoice>) rs.getArray("invoce");
						// add to list
						User user = new User(username, name, password, email, role, invoice);
						users.add(user);
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				return users;
			
			}

	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		User user = null;
		
		try(PreparedStatement pstmt = conn.prepareStatement("select * from users where username = ?")) {
			
			pstmt.setString(1, username);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				String username1 = rs.getString(1);
				String name = rs.getString(2);
				String password = rs.getString(3);
				String email=rs.getNString(4);
				ROLE role=User.ROLE.valueOf(rs.getString("role"));
				@SuppressWarnings("unchecked")
				List<Invoice> invoice=(List<Invoice>) rs.getArray("invoce");
				
				
				user = new User(username1, name, password, email, role, invoice);
			}
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return user;
	
	}
		

	public User getUserByPassword(String password) {
		  User user = null;
			
			try(PreparedStatement pstmt = conn.prepareStatement("select * from users where password = ?")) {
				
				pstmt.setString(1, password);
				
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					String username = rs.getString(1);
					String name = rs.getString(2);
					String password1 = rs.getString(3);
					String email=rs.getNString(4);
					ROLE role=User.ROLE.valueOf(rs.getString("role"));
					@SuppressWarnings("unchecked")
					List<Invoice> invoice=(List<Invoice>) rs.getArray("invoce");
					
					
					user = new User(username, name, password1, email, role, invoice);
				}
				
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			return user;
			}

	public User getUserByEmail(String email) {
		// TODO Auto-generated method stub
		 User user = null;
		 
		 try(PreparedStatement pstmt = conn.prepareStatement("select * from users where email = ?")) {
				
				pstmt.setString(1, email);
				
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					String username = rs.getString(1);
					String name = rs.getString(2);
					String password = rs.getString(3);
					String email1=rs.getNString(4);
					ROLE role=User.ROLE.valueOf(rs.getString("role"));
					@SuppressWarnings("unchecked")
					List<Invoice> invoice=(List<Invoice>) rs.getArray("invoce");
					
					
					
					user = new User(username, name, password, email1, role, invoice);
				}
				
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		
		return user;
		
	}

	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pstmt = conn.prepareStatement("insert into users values(?,?,?,?,?,?)");
			
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getPassword());
			pstmt.setNString(4, user.getEmail());
			pstmt.setString(5, user.getRole().name());
			pstmt.setArray(6, (Array) user.getPurchases());
			
			
			
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

	@Override
	public User getUserByRole(ROLE role) {
		// TODO Auto-generated method stub
		User user = null;
		 
		 try(PreparedStatement pstmt = conn.prepareStatement("select * from users where role = ?")) {
				
				pstmt.setString(1, user.getRole().name());
				
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					String username = rs.getString(1);
					String name = rs.getString(2);
					String password = rs.getString(3);
					String email1=rs.getNString(4);
					ROLE role1=User.ROLE.valueOf(rs.getString("role"));
					@SuppressWarnings("unchecked")
					List<Invoice> invoice=(List<Invoice>) rs.getArray("invoce");
					
					
					
					user = new User(username, name, password, email1, role1, invoice);
				}
				
				
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
			
		
		return user;
	}

}
