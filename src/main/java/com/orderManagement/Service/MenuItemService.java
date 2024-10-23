package com.orderManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderManagement.model.MenuItem;
import com.orderManagement.repository.MenuItemRepository;

@Service
public class MenuItemService {

	
	@Autowired
	MenuItemRepository  menuItemRepository;

	public void createNewMenuItem(MenuItem menuItem) {
	
		menuItemRepository.save(menuItem);
		
	}

	public List<MenuItem> getAllMenuItems() {	
	List<MenuItem>menuItemsList=menuItemRepository.findAll();
	return menuItemsList;
		
	}

	
	
}
