package com.escurity.test1.controllers;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
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
		List<BarangCp> result = proc.getResultList();
		
		
		model.addAttribute("barang2", result);
		
//		model.addAttribute("barang", barangCpRepository.getBarang());
		
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
	
		
		
	return "barangCp/list";
	}
	
	

}
