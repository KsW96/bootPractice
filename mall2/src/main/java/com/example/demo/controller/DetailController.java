package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.object.Item;
import com.example.demo.service.DetailService;

@Controller
@RequestMapping("/detail")
public class DetailController {
	@Autowired
	private DetailService service;
	
	@PostMapping(params = "name" )
	public String init(@RequestParam String name, Model model) {
		Item text = service.findByName(name);
		
		model.addAttribute("item",text);
		
		return "detail";
	}
}
