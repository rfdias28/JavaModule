package io.altar.jseproject.model;

public class Shelf {

	public Shelf(int shelfid, int capacity, Product product, double rentPrice) {
		super();
		this.shelfid = shelfid;
		this.capacity = capacity;
		this.product = product;
		this.rentPrice = rentPrice;
	}

	private int shelfid;
	private int capacity;
	private Product product;
	private double rentPrice;

	public int getShelfid() {
		return shelfid;
	}

	public void setShelfid(int shelfid) {
		this.shelfid = shelfid;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public double getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(double rentPrice) {
		this.rentPrice = rentPrice;
	}
}