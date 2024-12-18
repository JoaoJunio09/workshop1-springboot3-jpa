package com.educandoweb.infonet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.infonet.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {	
	// Não é preciso adicionar implementação, por que o Spring JPA já tem uma implementação para esta interface;
}
