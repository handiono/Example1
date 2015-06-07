package com.escurity.test1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.escurity.test1.entities.UserRoles;

;


public interface UserRoleRepository extends JpaRepository<UserRoles, Long>{
	
	List<UserRoles> findByRole(String role);
	
//	@Query("select ur from UserRoles ur where ur.users = ?1")
//	List<UserRoles> findByUserList(UserRoleRepository);
	
	//List<UserRoles> findByUsersEqualsU
	
	//List<UserRoles> findByUsers(Users users);
	
	// @Query("select ur from UserRoles ur where ur.users = ?1")
	//List<UserRoles> findByU(String u); 
	
	List<UserRoles> findByUsersId(long id);

}
