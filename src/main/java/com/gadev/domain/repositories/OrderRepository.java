package com.gadev.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadev.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
