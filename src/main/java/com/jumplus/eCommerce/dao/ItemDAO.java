package com.jumplus.eCommerce.dao;

import java.util.List;

import com.jumplus.eCommerce.model.Item;

public interface ItemDAO {
public List<Item> getAllItems();
	
	public Item getItemByName(String name);
	
	public Item getItemByCode(String code);
	public boolean addItems(Item item);
}
