package com.escurity.test1.controllers;


import java.sql.ResultSet;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.escurity.test1.entities.BarangCp;
import com.escurity.test1.repositories.BarangCpRepository;


@Controller
public class BarangCpController {
	
	@Autowired
	BarangCpRepository barangCpRepository ;
	
	@Autowired
	EntityManager em;
	
	

//	private final EntityManager em 
//	this.em = em;
//	StoredProcedureQuery query = em.createNamedStoredProcedureQuery("ab");
//	@SuppressWarnings("unchecked")
//	List<BarangCp> result = (List<BarangCp>)query.getOutputParameterValue("partname");
	
	
	@RequestMapping(value="/barangCp", method = RequestMethod.GET)
	public String ambilStoredProcedurBarang(Model model){
		
		StoredProcedureQuery proc = em.createNamedStoredProcedureQuery("BarangCp.get");
		proc.execute();
//		List hasil = proc.getResultList();
//		
//		for(int i=0; i<proc.getMaxResults();i++){
//			BarangCp barangCp = (BarangCp) hasil.get(i);
//			
//		}
//		
//		String name = proc.getOutputParameterValue("partname").toString();
//		//List hasil = proc.getResultList();
//		Object hasil = proc.getResultList();
		
		
//		Query spq = em.createNamedQuery("sp");
//		List barangs = spq.getResultList();
	
		model.addAttribute("barang2", proc.getResultList());
		
	return "barangCp/list";
	}
	
	

}
