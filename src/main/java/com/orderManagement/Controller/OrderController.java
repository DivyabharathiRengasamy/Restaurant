package com.orderManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderManagement.Exceptions.OrderNotFoundException;
import com.orderManagement.Service.OrderService;
import com.orderManagement.model.Order;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/menu")
public class OrderController {
	
	@Autowired
	OrderService  orderService;

	@PostMapping("/createNewOrder")
	
	public ResponseEntity<String>createNewOrder(@Valid @RequestBody Order order){
		orderService.createNewOrder(order);
		return new  ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getOrderDetails/{id}")
	public ResponseEntity<Order>getOrderDetails(@PathVariable Long id) throws OrderNotFoundException{
	Order order=orderService.getOrderDetails(id);
		return new ResponseEntity<Order>(order, HttpStatus.OK);
	}
	
	
}
