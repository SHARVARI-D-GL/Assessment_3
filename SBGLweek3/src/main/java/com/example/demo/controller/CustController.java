package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustController {

	@RequestMapping("/info")
	public String customerInformation(@RequestParam("custid") String custid,
			@RequestParam("custname") String custname,
			@RequestParam("custphone") String custphone,
			@RequestParam("custaddress") String custaddress,
			@RequestParam("custloginid") String custloginid,
			@RequestParam("custpassword") String custpassword,
			
			Model m) {
		m.addAttribute("custid",custid);
		m.addAttribute("custname",custname);
		m.addAttribute("custphone",custphone);
		m.addAttribute("custaddress",custaddress);
		m.addAttribute("custloginid",custloginid);
		m.addAttribute("custpassword",custpassword);
		
		return "customerInfo";
	}
	
	@RequestMapping("/form")
	public String customerForm() {

		return "customerForm";
	}
}