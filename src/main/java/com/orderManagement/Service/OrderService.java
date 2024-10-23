package com.orderManagement.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderManagement.Exceptions.OrderNotFoundException;
import com.orderManagement.model.MenuItem;
import com.orderManagement.model.Order;
import com.orderManagement.repository.MenuItemRepository;
import com.orderManagement.repository.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired 
	MenuItemRepository menuItemRepository;
	
	
	public void createNewOrder(Order order) {
		orderRepository.save(order);
	}


	public Order getOrderDetails(Long id) throws OrderNotFoundException {
		
	Order order=orderRepository.findById(id).orElseThrow(()->new OrderNotFoundException("order not found"));
		return order;
		
		
	}
	
	
//	Calculate order total based on item prices and quantities 
//	Update inventory (availableQuantity) when order is placed
//	Prevent ordering items with insufficient quantity
	
	

	
	
	
}
