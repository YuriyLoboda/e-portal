package service;

import java.util.List;

import javax.persistence.Temporal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.CatalogDao;
import domain.Catalog;
@Service
public class CatalogServImpl implements CatalogServ{

	private CatalogDao catalogDao;
	
	@Autowired
	@Qualifier("catalogDao")
	public void setCatalogDao(CatalogDao catalogDao) {
		this.catalogDao = catalogDao;
	}
	@Transactional
	public Long add(Catalog catalog) {
		return catalogDao.create(catalog);
		
	}
	@Transactional
	public Catalog read(Long id) {
		return catalogDao.read(id);
	}
	@Transactional
	public void update(Catalog catalog) {
		// TODO Auto-generated method stub
		catalogDao.update(catalog);
	}
	@Transactional
	public void delete(Catalog catalog) {
		// TODO Auto-generated method stub
		catalogDao.delete(catalog);
	}
	@Transactional
	public List<Catalog> findAll() {
		// TODO Auto-generated method stub
		return catalogDao.findAll();
	}

}
