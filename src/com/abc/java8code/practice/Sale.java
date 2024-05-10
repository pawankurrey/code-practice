package com.abc.java8code.practice;

class Sale {
	private final int id;
	private final String product;
	private final int quantity;
	private final int price;

	public Sale(int id, String product, int quantity, int price) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

}
