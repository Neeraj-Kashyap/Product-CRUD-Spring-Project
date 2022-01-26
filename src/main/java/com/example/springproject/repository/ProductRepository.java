package com.example.springproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springproject.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

	Product findByName(String name);

}
