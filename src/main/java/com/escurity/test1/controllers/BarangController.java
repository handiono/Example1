package com.escurity.test1.controllers;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.escurity.test1.entities.Barang;
import com.escurity.test1.repositories.BarangRepository;

@Controller
public class BarangController {
	
	@Autowired
	BarangRepository barangRepository ;
	
	//Map<Integer, Barang> brgData = new HashMap<Integer, Barang>();
	
//	@RequestMapping(value="/barangRest", method = RequestMethod.GET)
//	public @ResponseBody List<Barang> restNamaBarang(){
//	
//	return barangRepository.findAll();
//	
//	}
	
	@RequestMapping(value="/barang", method = RequestMethod.GET)
	public String ambilNamaBarang(Model model){
	model.addAttribute("barang2", barangRepository.findAll());
	return "barang/list";
	}
	
	@RequestMapping(value = "/barang", params = "tambah", method = RequestMethod.GET)
	public String inputNamaBarang(){
		return "barang/view";
	}
	
	@RequestMapping(value = "/barang", params = "ganti", method = RequestMethod.GET)
	public String gantiNamaBarang(@RequestParam long id, Model model){
		
		model.addAttribute("barang1", barangRepository.findOne(id));
		return "barang/edit";
	}
	
	
	@RequestMapping(value = "/barang", params = "ganti", method = RequestMethod.POST)
	public String postEditBarang(@RequestParam long id, @RequestParam String partno, 
			@RequestParam String partname) {
		
		Barang barangganti = barangRepository.findOne(id);
		barangganti.setPartname(partname);
		barangganti.setPartno(partno);
		barangRepository.save(barangganti);
		
		return "redirect:barang";
	}

	@RequestMapping(value = "/barang", params = "tambah", method = RequestMethod.POST)
	public String postHapusBarang(@RequestParam String partno, 
			@RequestParam String partname) {
		Barang barangbaru = new Barang(partno, partname);
		barangbaru = barangRepository.save(barangbaru);
		
		return "redirect:barang";
	}
	
	@RequestMapping(value = "/barang", params = "hapus", method = RequestMethod.POST)
	public String postTambahBarang(@RequestParam long id) {
		
		Barang baranghapus = barangRepository.findOne(id);
		barangRepository.delete(baranghapus);
		
		return "redirect:barang";
	}
	

}
