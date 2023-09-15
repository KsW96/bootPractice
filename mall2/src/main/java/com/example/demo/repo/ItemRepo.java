package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.object.Item;

@Repository
@RepositoryRestResource(path = "item")
public interface ItemRepo extends CrudRepository<Item, String> {

	List<Item> findAll();

	Item findByName(String name);

	List<Item> findByNameContaining(String name);

}
