package com.caio.famarcia.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class CategoryModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategory;
	
	@NotBlank(message = "Informe o Gênero")
	private String genre;
	
	@NotBlank(message = "Informe a Descrição")
	private String description;
	
	@NotBlank(message = "Informe a Classificação")
	private String classification;
	
	public CategoryModel() {
		super();
	}
	
	public CategoryModel(int idCategory, String genre, String description, String classification) {
		super();
		this.idCategory = idCategory;
		this.genre = genre;
		this.description = description;
		this.classification = classification;
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}
	
}
