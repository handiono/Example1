package com.escurity.test1.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.escurity.test1.entities.UserRoles;
import com.escurity.test1.entities.Users;
import com.escurity.test1.repositories.UserRoleRepository;
import com.escurity.test1.repositories.UsersRepository;

@Controller
public class UserController {
	
	@Autowired
	UsersRepository userRepository; 
	
	@Autowired
	UserRoleRepository userRoleRepository;
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public String ambilNamaUser(Model model){
	model.addAttribute("user2", userRepository.findAll());
	return "user/list";
	}
	
	@RequestMapping(value = "/user", params = "tambah", method = RequestMethod.GET)
	public String inputUser(){
		return "user/view";
	}
	
	@RequestMapping(value = "/user", params = "ganti", method = RequestMethod.GET)
	public String gantiUser(@RequestParam long id, Model model){
		
		model.addAttribute("user1", userRoleRepository.findOne(id));
		return "user/edit";
	}
	
//	@RequestMapping(value = "/user", params = "tambahrole", method = RequestMethod.GET)
//	public String lihatUserRole(@RequestParam long id, Model model){
//	
//		model.addAttribute("user", userRepository.findOne(id)); 
//		
//		Users users = userRepository.findOne(id);
//		model.addAttribute("userrole", userRoleRepository.findAll());
//		return "user/tambahrole";
//	}
	
	@RequestMapping(value="/user", params = "tambah", method = RequestMethod.POST)
	public String tambahUser(@RequestParam String username,
							@RequestParam String password, 
							@RequestParam String role,
							@RequestParam String enable) {
		
		Users orangbaru = new Users(username, password, enable);
		UserRoles rolebaru  = new UserRoles(orangbaru, role);
		rolebaru = userRoleRepository.save(rolebaru);
		
		return "redirect:user";
	}
	
	@RequestMapping(value = "/user", params = "ganti", method = RequestMethod.POST)
	public String editUser(@RequestParam long id,
							@RequestParam String password, 
							@RequestParam String role,
							@RequestParam String enable){
		
		UserRoles ur = userRoleRepository.findOne(id);
		Users u = ur.getUsers();
		
		ur.setRole(role);
		u.setPassword(password);
		u.setEnable(enable);
		userRepository.save(u);
		userRoleRepository.save(ur);
		
		return "redirect:user";
	}
	
	@RequestMapping(value = "/user", params = "tambahrole", method = RequestMethod.POST)
	public String tambahUserRole(@RequestParam long id, 
							@RequestParam String role){
		
		Users u = userRepository.findOne(id);
		UserRoles ur = new UserRoles(u, role);
		userRoleRepository.save(ur);
		
		return "redirect:user";
	}

	@RequestMapping(value = "/user", params = "hapus", method = RequestMethod.POST)
	public String hapusUser(@RequestParam long id) {
		
		Users u = userRepository.findOne(id);
		userRepository.delete(u);
		
		return "redirect:user";
	}

}
