package dao;

import java.util.List;

import org.hibernate.Query;
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
	public User findUserByloginAndPassword(String login, String pass) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createSQLQuery("select * from users where login = :a and pass= :b").addEntity(User.class);
		query.setParameter("a", login);
		query.setParameter("b",pass);
		User user = null;
		try {
			 user = (User) query.list().get(0);
		}
		catch(IndexOutOfBoundsException ex){
			//NOP
			}
		
		if(user!=null){
			return user;
		}
		return null;
	}

}
