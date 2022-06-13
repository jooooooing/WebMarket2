package com.webmarket.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.webmarket.domain.model.Product;


//다형성
public class ProductRepository {
	
	public static void main(String[] args) {
		
		// 삽입, 삭제가 빈번할 때 항상 동일 성능, but ArrayList보다 검색이 느려
		// 메모리 조금 더 많이 먹어
		List<Product> products = new LinkedList<>();
		
		// 크기가 커질 수록 삽입, 삭제가 느려짐. 내부적으로는 배열이라 성능이 일단 빨라
		List<Product> products2 = new ArrayList<>();	
		
		sort(products);
		sort(products2);
		
		
	}
	
	public static List<Product> sort(List<Product> products) {
		//정렬...
		return new ArrayList<>();
	}
}
