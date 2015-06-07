package com.escurity.test1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escurity.test1.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	
	Users findByUsername(String username);

}
