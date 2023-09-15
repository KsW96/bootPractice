package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {
	
	
	
	@Autowired
	private CartService service;
	
	@GetMapping
	public String cart() {
		
		return "cart";
	}
}
