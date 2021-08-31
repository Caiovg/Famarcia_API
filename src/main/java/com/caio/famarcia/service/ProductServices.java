package com.caio.famarcia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
