package com.example.springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springproject.entity.Product;
import com.example.springproject.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	/**
	 * This method will save the product
	 * @param product Product object
	 * @return return the save details.
	 */
	public Product saveProduct(Product product){
		return repository.save(product);
	}

	/**
	 * This method will save a list of products
	 * @param products Product list.
	 * @return return the save details.
	 */
	public List<Product> saveProducts(List<Product> products){
		return repository.saveAll(products);
	}

	/**
	 * This method will get the products.
	 * @return: gets the product details.
	 */
	public List<Product> getProducts(){
		return repository.findAll();
	}

	/**
	 * This method will get the product by id.
	 * @param id Pass the id.
	 * @return return the product by id.
	 */
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
	}

	/**
	 * This method will get the product by name.
	 * @param name Pass the name
	 * @return return the product by name.
	 */
	public Product getProductByName(String name){
		return repository.findByName(name);
	}

	/**
	 * Delete the product by id.
	 * @param id: Product id.
	 * @return: Returns the statement of product deletion.
	 */
	public String deleteProduct(int id){
		repository.deleteById(id);
		return "Product is removed "+id;
	}

	/**
	 * Update the Product details.
	 * @param product: Product object
	 * @return: updated the product details.
	 */
	public Product updateProduct(Product product){
		Product existingProduct = repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());

		return repository.save(existingProduct);
	}

}
