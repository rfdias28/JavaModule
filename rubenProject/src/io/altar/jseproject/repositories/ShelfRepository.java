package io.altar.jseproject.repositories;

import io.altar.jseproject.model.Shelf;

public class ShelfRepository extends EntityRepository <Shelf> {

	private ShelfRepository() {
		// TODO Auto-generated constructor stub
	}
private static final ShelfRepository INSTANCE = new ShelfRepository() ;
	
	
	public static ShelfRepository getInstance(){

		return INSTANCE;
	}
	
}
