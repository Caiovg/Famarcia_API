package com.caio.famarcia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.caio.famarcia.model.CategoryModel;
import com.caio.famarcia.repository.CategoryRepository;


@Service
public class CategoryServices {

	@Autowired
	private CategoryRepository repository;
	
	public List<CategoryModel> findAllCategory() {
		return repository.findAll();
	}
	
	public ResponseEntity<CategoryModel> findByIDCategory(Integer id) {
		return repository.findById((int) id).map(
				resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	public ResponseEntity<CategoryModel> findByDescricaoCategoria(String description) {
		return ResponseEntity.ok(repository.findByDescription(description));
	}
	
	public ResponseEntity<CategoryModel> postCategory(CategoryModel category) {
		return ResponseEntity.ok(repository.save(category));
	}
}
