package com.jumplus.eCommerce.dao;

import java.util.List;

import com.jumplus.eCommerce.model.User;
import com.jumplus.eCommerce.model.User.ROLE;

public interface UserDAO {
	  public List<User> getAllUsers();
		
		public User getUserByUsername(String username);
		
		public User getUserByPassword(String password);
		
		public User getUserByEmail(String email);
		public User getUserByRole(ROLE role);
		
		public boolean addUser(User user);
	}

