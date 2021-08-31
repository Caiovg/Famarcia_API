package com.caio.famarcia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caio.famarcia.model.ProductModel;
import com.caio.famarcia.service.ProductServices;
import com.caio.games.model.Produto;

@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductServices service;
	
	@GetMapping
	public ResponseEntity<List<ProductModel>> findAllProduct(){
		List<ProductModel> obj = service.findAllProduct();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductModel> findByIDProduct(@PathVariable Integer id){
		ResponseEntity<ProductModel> obj = service.findByIDProduct(id);
		return obj;
	}
	
	@GetMapping(value = "/title/{title}")
	public ResponseEntity<ProductModel> findByDescriptionTitle(@PathVariable String title){
		ResponseEntity<ProductModel> obj = service.findByDescriptionTitle(title);
		return obj;
	}
}
