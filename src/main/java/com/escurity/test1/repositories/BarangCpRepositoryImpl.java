package com.escurity.test1.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.escurity.test1.entities.BarangCp;

public class BarangCpRepositoryImpl implements BarangCpRepositoryCustom {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public  BarangCp ambilNamaBarang() {

//		StoredProcedureQuery spq = em.createStoredProcedureQuery("getBarang");
//		spq.execute();
//		
//		return (BarangCp) spq.getResultList();
		
		String queryString = "CALL getBarang";
		Query query = em.createStoredProcedureQuery(queryString);
		
		return (BarangCp) query.getResultList();
		
		
		
	}
}