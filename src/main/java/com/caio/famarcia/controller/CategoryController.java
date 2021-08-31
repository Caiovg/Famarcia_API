package com.caio.famarcia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caio.famarcia.model.CategoryModel;
import com.caio.famarcia.service.CategoryServices;



@CrossOrigin("*")
@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryServices service;

	@GetMapping
	public ResponseEntity<List<CategoryModel>> findAllCategory(){
		List<CategoryModel> obj = service.findAllCategory();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CategoryModel> findByIDCategoria(@PathVariable Integer id){
		ResponseEntity<CategoryModel> obj = service.findByIDCategory(id);
		return obj;
	}
	
	@GetMapping(value = "/description/{description}")
	public ResponseEntity<CategoryModel> findByDescricaoCategoria(@PathVariable String description){
		ResponseEntity<CategoryModel> obj = service.findByDescricaoCategoria(description);
		return obj;
	}
	
	@PostMapping
	public ResponseEntity<CategoryModel> postCategoria(@RequestBody CategoryModel category){
		ResponseEntity<CategoryModel> obj = service.postCategory(category);
		return obj;
	}
	
	@PutMapping
	public ResponseEntity<CategoryModel> putCategory(@RequestBody CategoryModel category){
		ResponseEntity<CategoryModel> obj = service.putCategory(category);
		return obj;
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable Integer id) {
		service.deleteCategory(id);
	}
}
