package com.abc.java8code.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SaleReport {

	public static Map<String, Integer> getTotalQuantityByProduct(List<Sale> saleList) {
		Map<String, Integer> totalQuantityByProduct = saleList.stream()
				.collect(Collectors.groupingBy(Sale::getProduct, Collectors.summingInt(Sale::getQuantity)));

		System.out.println(totalQuantityByProduct);

		return totalQuantityByProduct;
	}

	public static void main(String[] args) {
		List<Sale> saleList = new ArrayList<>();

		saleList.add(new Sale(1, "shoe", 5, 50));
		saleList.add(new Sale(1, "watch", 10, 150));
		saleList.add(new Sale(1, "spec", 3, 50));
		saleList.add(new Sale(1, "socks", 15, 20));
		saleList.add(new Sale(1, "mobile", 25, 550));
		saleList.add(new Sale(1, "ring", 5, 550));
		saleList.add(new Sale(1, "shoe", 5, 50));
		saleList.add(new Sale(1, "watch", 10, 150));
		saleList.add(new Sale(1, "spec", 3, 50));
		saleList.add(new Sale(1, "socks", 15, 20));
		saleList.add(new Sale(1, "mobile", 25, 550));
		saleList.add(new Sale(1, "ring", 5, 550));
		saleList.add(new Sale(1, "shoe", 5, 50));
		saleList.add(new Sale(1, "watch", 10, 150));
		saleList.add(new Sale(1, "spec", 3, 50));
		saleList.add(new Sale(1, "socks", 15, 20));
		saleList.add(new Sale(1, "mobile", 25, 550));
		saleList.add(new Sale(1, "ring", 5, 550));
		saleList.add(new Sale(1, "shoe", 5, 50));
		saleList.add(new Sale(1, "watch", 10, 150));
		saleList.add(new Sale(1, "spec", 3, 50));
		saleList.add(new Sale(1, "socks", 15, 20));
		saleList.add(new Sale(1, "mobile", 25, 550));
		saleList.add(new Sale(1, "ring", 5, 550));
		getTotalQuantityByProduct(saleList);
	}

}
