package com.caio.famarcia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.caio.famarcia.model.ProductModel;
import com.caio.famarcia.repository.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	private ProductRepository repository;
	
	public List<ProductModel> findAllProduct() {
		return repository.findAll();
	}
	
	public ResponseEntity<ProductModel> findByIDProduct(Integer id) {
		return repository.findById((int) id).map(
				resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	public ResponseEntity<ProductModel> findByDescriptionTitle(String title) {
		return ResponseEntity.ok(repository.findByName(title));
	}
	
	public ResponseEntity<ProductModel> postProduct(ProductModel product) {
		return ResponseEntity.ok(repository.save(product));
	}
	
	public ResponseEntity<ProductModel> putProduct(ProductModel product) {
		return ResponseEntity.ok(repository.save(product));
	}
	
	public void deleteProduct(Integer id) {
		repository.deleteById(id);
	}
}
