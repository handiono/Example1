package com.escurity.test1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.escurity.test1.entities.Barang;
import com.escurity.test1.entities.Transaksi;
import com.escurity.test1.entities.TransaksiBarang;
import com.escurity.test1.repositories.BarangRepository;
import com.escurity.test1.repositories.TransaksiBarangRepository;
import com.escurity.test1.repositories.TransaksiRepository;


@Controller
public class TransaksiBarangController {

	@Autowired
	private TransaksiBarangRepository transaksiBarangRepository;
	
	@Autowired
	private BarangRepository barangRepository;
	
	@Autowired
	private TransaksiRepository transaksiRepository;
	
	@RequestMapping(value="/stock", method = RequestMethod.GET)
	public String ambilNamaStock(Model model){
	model.addAttribute("transaksi2", transaksiBarangRepository.findAll());
	return "stock/list";
	}
	
	@RequestMapping(value = "/stock", params = "tambah", method = RequestMethod.GET)
	public String inputNamaStock(Model model){
		model.addAttribute("barang2", barangRepository.findAll());
		model.addAttribute("transaksi2", transaksiRepository.findAll());
		return "stock/view";
	}
	
	@RequestMapping(value = "/stock", params = "ganti", method = RequestMethod.GET)
	public String gantidaftarTransaksi(@RequestParam long id, Model model){
		model.addAttribute("barang3", barangRepository.findAll());
		model.addAttribute("transaksi3", transaksiRepository.findAll());
		model.addAttribute("transaksibarang3", transaksiBarangRepository.findOne(id));
		return "stock/edit";
	}
	
	
	@RequestMapping (value = "/stock", params = "tambah", method = RequestMethod.POST)
	public String tambahTransaksi(@RequestParam long b_id, @RequestParam long t_id, @RequestParam long quantity) {
		
		Barang barang = barangRepository.findOne(b_id);
		Transaksi transaksi = transaksiRepository.findOne(t_id);
		
		
		TransaksiBarang t = new TransaksiBarang(barang, transaksi, quantity);
		t = transaksiBarangRepository.save(t);
		
		return "redirect:stock";
	}
	
	@RequestMapping (value = "/stock", params = "edit", method = RequestMethod.POST)
	public String editDaftarTransaksi(@RequestParam long id, @RequestParam long b_id, @RequestParam long t_id, @RequestParam long quantity) {
		
		Barang barang = barangRepository.findOne(b_id);
		Transaksi transaksi = transaksiRepository.findOne(t_id);
		TransaksiBarang tb = transaksiBarangRepository.findOne(id);
		
		tb.setBarang(barang);
		tb.setTransaksi(transaksi);
		tb.setQuantity(quantity);
		transaksiBarangRepository.save(tb);
		
		return "redirect:stock";
		
	}
	
}
