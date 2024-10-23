package com.orderManagement.model;

import java.time.LocalDateTime;
import java.util.List;

import com.orderManagement.enums.OrderStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Column(nullable = false)
	@OneToMany
	private List<OrderItem>orderItem;
	
	@Column(nullable = false)
	private double totalAmount;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderstatus;
	
	@NotEmpty(message = "customer name is required")
	@Column(nullable = false)
	 private String  customerName;
	
	@NotEmpty(message = "customer phone is required")
	@Column(nullable = false)
	 private String customerPhone;
	
	@Column(nullable = false)
	 private LocalDateTime createdAt;
	 
	
	public Order() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<OrderItem> getOrderItem() {
		return orderItem;
	}


	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public OrderStatus getOrderstatus() {
		return orderstatus;
	}


	public void setOrderstatus(OrderStatus orderstatus) {
		this.orderstatus = orderstatus;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerPhone() {
		return customerPhone;
	}


	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
}
