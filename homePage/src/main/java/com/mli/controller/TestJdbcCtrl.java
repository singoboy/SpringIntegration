package com.mli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mli.service.UserService;

@Controller
public class TestJdbcCtrl {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/dUser")
	@ResponseBody
	public String deleteUserById(String name) {
		userService.deleteUserByName(name);
		return "sucess";
	}
	

}
