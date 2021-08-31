package com.caio.famarcia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.caio.famarcia.model.ProductModel;

public interface ProductRepository extends JpaRepository<ProductModel, Integer>{

	@Query("SELECT obj FROM ProductModel obj WHERE UPPER(obj.name) LIKE CONCAT('%',UPPER(:name),'%')")
	ProductModel findByName(@Param("name") String name);
}
