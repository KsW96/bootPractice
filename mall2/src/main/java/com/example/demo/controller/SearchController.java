package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.object.Item;
import com.example.demo.service.SearchService;

@Controller
@RequestMapping("/search")
public class SearchController {
	@Autowired
	private SearchService service;

	@GetMapping(params = "search")
	public String search(@RequestParam String search, Model model) {
		List<Item> list = service.findLikeName(search);

		model.addAttribute("list", list);

		return "search";
	}
}
