package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IProductsDAO;
import com.example.demo.dto.Products;

@Service
public class ProductsServiceImpl implements IProductsService{

	@Autowired
	IProductsDAO iProductsDAO;
	
	@Override
	public List<Products> listarProducts() {
		return iProductsDAO.findAll();
	}
	
	@Override
	public Products guardarProduct(Products product) {
		return iProductsDAO.save(product);
	}

	@Override
	public Products buscarProduct(int id) {
		return iProductsDAO.findById(id).get();
	}

	@Override
	public Products actualizarProduct(Products product) {
		return iProductsDAO.save(product);
	}

	@Override
	public void eliminarProduct(int id) {
		iProductsDAO.deleteById(id);
	}

}
