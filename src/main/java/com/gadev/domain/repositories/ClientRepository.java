package com.gadev.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gadev.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
