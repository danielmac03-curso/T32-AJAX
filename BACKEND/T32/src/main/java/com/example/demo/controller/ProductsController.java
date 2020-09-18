package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.Products;
import com.example.demo.service.ProductsServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE})
@RequestMapping("/api")
public class ProductsController {
	
	@Autowired
	ProductsServiceImpl productsServideImpl;

	
	@GetMapping("/products")
	public List<Products> listarProducts(){
		return productsServideImpl.listarProducts();
	}
	
	
	@PostMapping("/products")
	public Products salvarProducts(@RequestBody Products products) {	
		return productsServideImpl.guardarProduct(products);
	}
	
	
	@GetMapping("/products/{id}")
	public Products buscarProducts(@PathVariable(name="id")int id) {
		
		Products productId= new Products();
		
		productId = productsServideImpl.buscarProduct(id);
		
		System.out.println("Id Products: " + productId);
		
		return productId;
	}

	
	@PutMapping("/products/{id}")
	public Products actualizarProducts(@PathVariable(name="id")int id,@RequestBody Products products) {
		
		Products products_seleccionado= new Products();
		Products products_actualizado= new Products();
		
		products_seleccionado= productsServideImpl.buscarProduct(id);
		
		products_seleccionado.setName(products.getName()); 
		products_seleccionado.setDetail(products.getDetail());
		products_seleccionado.setCreated_at(products.getCreated_at()); 
		products_seleccionado.setUpdate_at(products.getUpdate_at());
		
		products_actualizado = productsServideImpl.actualizarProduct(products_seleccionado);
		
		System.out.println("El products actualizado es: "+ products_actualizado);
		
		return products_actualizado;
	}

	
	
	@DeleteMapping("/products/{id}")
	public void eliminarProducts(@PathVariable(name="id")int id) {
		productsServideImpl.eliminarProduct(id);
	}

}


