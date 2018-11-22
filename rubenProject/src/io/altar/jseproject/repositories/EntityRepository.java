package io.altar.jseproject.repositories;

import java.util.HashMap;
import java.util.LinkedHashMap;

import io.altar.jseproject.model.Entity;

public abstract class EntityRepository<T extends Entity> {

//	private static final long serialVersionUID = 1L;
	private Map <Long, T > map = new HashMap <Long, T>();
	private long actualId=0;	

	private long nextID() {
		highestID++;
		return highestID;
	}
	
	public void save(T entity) {
		entity.setId(actualId);
		map.put(veic.getId(), entity);
		actualId++;
	}
	
	public T findById(Long id) {
		return map.get(id);
	}
	
	public void removeById(Long id) {		
		map.remove(id);
	}
	
	public void updateById(T veic) {
		map.replace(veic.getId(), veic);
	}
	
	public Collection<T> getAll() {
		return map.values();
	}
	
	public Map<Long, T> getMap() {
		return map;
	}
}

