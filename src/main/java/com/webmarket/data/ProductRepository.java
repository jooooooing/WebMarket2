package com.webmarket.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.webmarket.domain.model.Product;


//다형성
public class ProductRepository {
	
	private List<Product> products = new ArrayList<>();
	
	public ProductRepository() {
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
	
	
	
	public List<Product> getAllProducts() {
		return products;
	}
}
