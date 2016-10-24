package com.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	
	@RequestMapping("/")
	@ResponseBody
	public String generalInfo(){
		
		return "Hello <b> Sir </b>, Welcome to online Shopping Site";
		
	}

}
