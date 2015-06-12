package com.escurity.test1.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

import com.escurity.test1.entities.BarangCp;

public interface BarangCpRepository extends JpaRepository<BarangCp, Long>{
	
	/**
	 * Explicitly mapped to named stored procedure {@code User.plus1IO} in the {@link EntityManager}
	 * 
	 * @see User
	 */
//	@Procedure(name = "BarangCp.get")
//	Integer getBackedByOtherNamedStoredProcedure();

	/**
	 * Directly map the method to the stored procedure in the database (to avoid the annotation madness on your domain
	 * classes).
	 */
//	@Procedure
//	Integer getBarang();
	
}
