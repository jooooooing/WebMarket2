package com.webmarket.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.webmarket.domain.model.Product;
import com.webmarket.domain.repository.ProductRepository;

//다형성
public class ProductRepositoryImpl implements ProductRepository {
	private List<Product> products = new ArrayList<>();
	
	//싱글턴 패턴
	//1. static 인스턴스 준비
	//2. static 메서드로 인스턴스 리턴 ( getInstance() 이름을 주로 씀)
	//3. 생성자 막기 (24행 public에서 private으로 바꿈)
	private static ProductRepositoryImpl instance = new ProductRepositoryImpl();
	
	public static ProductRepositoryImpl getInstance() {
		return instance;
	}

	private ProductRepositoryImpl() {
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334*750 Retina HD display");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");

		Product notebook = new Product("P1235", "LG PC Gram", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refubished");

		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");

		products.add(phone);
		products.add(notebook);
		products.add(tablet);
	}
	
	@Override
	public List<Product> getAllProducts() {
		return products;
	}
	
	@Override
	public Product getProductById(String id) {
		// List --> Stream(데이터의 흐름)
		// p.173참고
		return products.stream().filter((product) -> product.getId().equals(id)) // 조건
				.findFirst() // 첫번째
				.get(); // 얻어

	}
	
	@Override
	public void addProduct(Product product) {
		products.add(product);
	}
	
	
}
