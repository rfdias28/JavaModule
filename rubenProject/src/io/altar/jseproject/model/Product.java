package io.altar.jseproject.model;

import java.util.ArrayList;

public class Product extends Entity {
	
	ArrayList<Shelf> shelves = new ArrayList<Shelf>();
	
	private double discountValue;
	private double iva;
	private double pvp;
//	private String shelves = "---";
	
	public Product( double discountValue, double iva, double pvp) {
		
		this.discountValue = discountValue;
		this.iva = iva;
		this.pvp = pvp;
/*		if (shelf != null) {
            shelves = Long.toString(shelf.getID());
            shelfList.add(shelf);
        }*/
	}
	public void addShelf(Shelf shelf) {
		shelves.add(shelf);
	}
	public void removeShelf(Shelf shelf) {
		shelves.remove(shelf);
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

	@Override
	public String toString() {
		return "Product "+getID()+ " [discountValue=" + discountValue + ", iva=" + iva + ", pvp=" + pvp + "]";
	}	
	
	
	
//	public String[] getDetails() {
//        String[] arr = {Long.toString(getID()),
//                Double.toString(getDiscount()),
//                Double.toString(getIVA()),
//                Double.toString(getPVP()),
//                shelves};
//        return arr;
//    }
//
//    public void computeShelvesString() {
//        if (shelvesList.size() == 0) {
//            shelves = "---";
//            return;
//        }
//        shelves = Long.toString(shelvesList.get(0).getID());
//        for (int i = 1; i < shelvesList.size(); i++) {
//            shelves += ";" + Long.toString(shelvesList.get(i).getID());
//        }
//    }
	
}