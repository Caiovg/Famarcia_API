package com.caio.famarcia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
