package com.gadev.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadev.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
