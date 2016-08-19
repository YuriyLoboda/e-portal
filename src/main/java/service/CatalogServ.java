package service;

import java.util.List;

import domain.Catalog;

public interface CatalogServ {
	
	Long add(Catalog catalog);
	Catalog read(Long id);
	void update(Catalog catalog);
	void delete(Catalog catalog);
	List<Catalog> findAll();
}
