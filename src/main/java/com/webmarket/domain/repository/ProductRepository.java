package com.webmarket.domain.repository;

import java.util.List;

import com.webmarket.data.ProductRepositoryImpl;
import com.webmarket.domain.model.Product;

public interface ProductRepository {

	public static ProductRepository getInstance() {
		return ProductRepositoryImpl.getInstance();
	}
	
	
	public List<Product> getAllProducts();

	public Product getProductById(String id);

	public void addProduct(Product product);

}
