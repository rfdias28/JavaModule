package io.altar.jseproject.model;

public class Product extends Entity {
	
	private int shelflist;
	private double discountValue;
	private double iva;
	private double pvp;
	
	public Product(int shelflist, double discountValue, double iva, double pvp) {
		super();
	
		this.shelflist = shelflist;
		this.discountValue = discountValue;
		this.iva = iva;
		this.pvp = pvp;
	}
	
	public int getShelflist() {
		return shelflist;
	}
	public void setShelflist(int shelflist) {
		this.shelflist = shelflist;
	}
	public double getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getPvp() {
		return pvp;
	}
	public void setPvp(double pvp) {
		this.pvp = pvp;
	}	
}