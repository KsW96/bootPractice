package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.object.Item;
import com.example.demo.repo.ItemRepo;

@Service
public class SearchService {
	@Autowired
	private ItemRepo repo;
	
	public List<Item> findLikeName(String name){
		return repo.findByNameContaining(name);
	}

}
