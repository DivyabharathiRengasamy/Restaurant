package com.orderManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderManagement.Service.MenuItemService;
import com.orderManagement.model.MenuItem;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class MenuControlller {
	
	@Autowired 
	MenuItemService menuItemService;
	
	@PostMapping("/createNewMenuItem")
	public ResponseEntity<String> createNewMenuItem(@Valid @RequestBody MenuItem menuItem) {
		
		menuItemService.createNewMenuItem(menuItem);
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getAllMenuItems")
	
	public ResponseEntity<List<MenuItem>> getAllMenuItems(){
		
	List<MenuItem>itemsList=	menuItemService.getAllMenuItems();
		return new ResponseEntity<List<MenuItem>>(itemsList, HttpStatus.OK);
}
}
