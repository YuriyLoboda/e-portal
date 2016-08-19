package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import domain.Catalog;
import domain.User;

public class UserDaoImpl implements UserDao {

private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	public Long create(User user) {
		Session session = sessionFactory.getCurrentSession();
		Long id = (Long) session.save(user);
		return id;
	}

	public User read(Long id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
		
	}

	public void delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
	}

	public List<User> findAll() {
		return (List<User>) sessionFactory.getCurrentSession().createSQLQuery("select * from users");
	}

}
