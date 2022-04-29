package com.example.lux.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class GlobalController {
	
	@RequestMapping(value="/index")
	public String index() {
		return "index.html";
	}
	
	@RequestMapping(value = "/Mypage")
	public String Mypage() {
		return "Mypage.html";
	}

}
