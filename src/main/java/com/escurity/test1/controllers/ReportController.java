package com.escurity.test1.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.escurity.test1.entities.Barang;
import com.escurity.test1.repositories.BarangRepository;

@Controller
@RequestMapping("/report/")
public class ReportController {

	private static final Logger logger = LoggerFactory.getLogger(ReportController.class);
	
	@Autowired
	BarangRepository barangRepository;
	
	@RequestMapping(value="html", method = RequestMethod.GET)
	public ModelAndView generateHtmlReport(ModelAndView modelAndView){
		
		logger.debug("------------buat HTML Report---------------");
		
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		
		List<Barang> barangList = barangRepository.findAll();
		
		JRDataSource JRDataSource = new JRBeanCollectionDataSource(barangList);
		parameterMap.put("datasource", JRDataSource);
		
		modelAndView = new ModelAndView("htmlReport", parameterMap);
		
		return modelAndView;
	}
	
	
}
