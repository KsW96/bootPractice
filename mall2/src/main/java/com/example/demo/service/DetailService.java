package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.object.Item;
import com.example.demo.repo.ItemRepo;

@Service
public class DetailService {
	@Autowired
	private ItemRepo repo;
	
	public Item findByName(String name) {
		return repo.findByName(name);
	}
}
