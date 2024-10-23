package com.orderManagement.model;



import com.orderManagement.enums.Category;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;

@Entity

public class MenuItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "name is required")
	private String  name;
	
	@Min(value = 0,message = "price must be positive")
	private Double price;
	
	@Min(value = 0,message = "availableQuantity must be non negative")
	private Integer availableQuantity;
	
	@Enumerated(EnumType.STRING)
	private Category category;

	
	
	public MenuItem() {
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Integer getAvailableQuantity() {
		return availableQuantity;
	}


	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
