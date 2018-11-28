package io.altar.jseproject.model;

public class Shelf extends Entity {
	
	private int capacity;
	private Product product;
	private double rentPrice;


	public Shelf(int capacity,  double rentPrice) {
		super();
		this.capacity = capacity;

		this.rentPrice = rentPrice;
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

	@Override
	public String toString() {
		if(product!=null) {
			return "Shelf [capacity=" + capacity + ", product=" + product.getID() + ", rentPrice=" + rentPrice + "]";
		}
		else {
			return "Shelf [capacity=" + capacity + ", product= " + "nao tem" + ", rentPrice=" + rentPrice + "]";
		}
	}
	
	
}
