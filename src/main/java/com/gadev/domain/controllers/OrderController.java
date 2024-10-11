package com.gadev.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gadev.domain.repositories.OrderRepository;
import com.gadev.domain.entities.Order;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {
	
	@Autowired
	private OrderRepository repository;
		
		@GetMapping(value = "/{id}")
		public  ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
	
}
