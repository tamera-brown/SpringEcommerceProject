package com.jumplus.eCommerce.model;

import java.util.ArrayList;
import java.util.List;

public class User {

	
	public enum ROLE{
		USER,ADMIN
	}
	
	private String username;
	private String name;
	private String password;
	private String email;
	private ROLE role;
	public List<Invoice> purchases;
	
	public User() {
		this("N/A, 'N/A", "N/A", "N/A", "N/A",ROLE.USER, new ArrayList<Invoice>());
	}
	
	
	public User(String username, String name, String password, String email, ROLE role, List<Invoice> invoice) {
		super();
		this.username = username;
		this.name = name;
		this.password = password;
		this.email = email;
		this.role = role;
		this.purchases = invoice;
	}


	

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public ROLE getRole() {
		return role;
	}


	public void setRole(ROLE role) {
		this.role = role;
	}


	public List<Invoice> getPurchases() {
		return purchases;
	}


	public void setPurchases(List<Invoice> purchases) {
		this.purchases = purchases;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", password=" + password + ", email=" + email
				+ ", role=" + role + ", purchases=" + purchases + "]";
	}
	
	
	
}
