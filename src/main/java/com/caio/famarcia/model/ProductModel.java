package com.caio.famarcia.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "product")
public class ProductModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;
	
	@NotBlank(message = "Informe o Nome")
	private String name;
	
	@NotBlank(message = "Informe a Descrição")
	private String description;
	
	@NotNull(message = "Informe a Quantidade")
	private int qtd;
	
	@NotNull(message = "Informe o Preço")
	private float price;

	public ProductModel() {
		super();
	}
	
	public ProductModel(int idProduct,  String name, String description, int qtd, float price) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.description = description;
		this.qtd = qtd;
		this.price = price;
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
