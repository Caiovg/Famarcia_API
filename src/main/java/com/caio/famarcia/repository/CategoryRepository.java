package com.caio.famarcia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.caio.famarcia.model.CategoryModel;

public interface CategoryRepository extends JpaRepository<CategoryModel, Integer>{

	@Query("SELECT obj FROM CategoryModel obj WHERE UPPER(obj.description) LIKE CONCAT('%',UPPER(:description),'%')")
	CategoryModel findByDescription(@Param("description") String description);
}
