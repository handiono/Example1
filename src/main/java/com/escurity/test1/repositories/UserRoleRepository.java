package com.escurity.test1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escurity.test1.entities.UserRoles;


public interface UserRoleRepository extends JpaRepository<UserRoles, Long> {

}
