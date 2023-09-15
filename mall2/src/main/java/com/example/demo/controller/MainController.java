package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.object.Item;
import com.example.demo.service.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService service;
	
	@GetMapping("/main")
	public String main(Model model){
		List<Item> Itemlist = service.findAll();
		
		model.addAttribute("itemList",Itemlist);
		
		return "main";
	}
}
