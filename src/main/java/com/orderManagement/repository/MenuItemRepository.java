package com.orderManagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderManagement.model.MenuItem;

public interface MenuItemRepository extends JpaRepository<MenuItem, Long> {

	Optional<MenuItem> findbyPriceAndAvailableQuantity();

}
