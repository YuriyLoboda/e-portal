package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import domain.Adword;
import domain.Catalog;

public class CatalogDaoImpl implements CatalogDao{

	private SessionFactory sessionFactory;
	@Autowired
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	public Long create(Catalog catalog) {
		Session session = sessionFactory.getCurrentSession();
		Long id = (Long) session.save(catalog);
		return id;
		
	}

	public Catalog read(Long id) {
		return (Catalog) sessionFactory.getCurrentSession().get(Catalog.class, id);
	}

	public void update(Catalog catalog) {
		sessionFactory.getCurrentSession().update(catalog);
		
	}

	public void delete(Catalog catalog) {
		sessionFactory.getCurrentSession().delete(catalog);
	}

	public List<Catalog> findAll() {
		return (List<Catalog>) sessionFactory.getCurrentSession().createSQLQuery("select * from catalogs");
	}
	

}
