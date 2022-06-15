package com.webmarket.data.dao;

import java.util.List;

import com.webmarket.domain.model.Product;

// Data Access Object
// DB랑 연결할 놈
public interface ProductDao {
	
	//interface 안에서는 public이 생략되어있고 public만 됨
	List<Product> getAll();
	
	void insert(Product product);
	
	void update(Product product);
	
	void delete(Product product);

}
