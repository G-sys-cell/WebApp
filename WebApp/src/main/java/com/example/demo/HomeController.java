package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/Hello")
public class HomeController {
	@RequestMapping("/Hi")
 public String showPage() { 
		return "main";
		}

@RequestMapping("/Hi1")
public String showPage1() { 
		return "main1";}
}