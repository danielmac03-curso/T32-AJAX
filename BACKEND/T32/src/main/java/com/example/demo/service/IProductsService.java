package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.Products;

public interface IProductsService {

	public List<Products> listarProducts();
	
	public Products guardarProduct(Products product);
	
	public Products buscarProduct(int id);
	
	public Products actualizarProduct(Products product);
	
	public void eliminarProduct(int id);
	
}
