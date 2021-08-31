package com.caio.famarcia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.famarcia.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Integer>{

}
