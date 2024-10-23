package com.orderManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderManagement.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
