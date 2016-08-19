package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.Adword;
@Repository
public class AdwordDaoImpl implements AdwordDao {
private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	public Long create(Adword Adword) {
		Session session = sessionFactory.getCurrentSession();
		Long id = (Long) session.save(Adword);
		return id;
		
	}

	public Adword read(Long id) {
		return (Adword) sessionFactory.getCurrentSession().get(Adword.class, id);
	}

	public void update(Adword adword) {
		sessionFactory.getCurrentSession().update(adword);
		
	}

	public void delete(Adword adword) {
		sessionFactory.getCurrentSession().delete(adword);
	}

	public List<Adword> findAll(String type) {
		return (List<Adword>) sessionFactory.getCurrentSession().createSQLQuery("select * from :a").setParameter("a",type);
	}


}
