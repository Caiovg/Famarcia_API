package com.caio.famarcia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.famarcia.model.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel, Integer>{

}
