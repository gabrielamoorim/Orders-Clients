package com.gadev.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadev.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
