package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Products;

public interface IProductsDAO extends JpaRepository<Products, Integer>{

}
