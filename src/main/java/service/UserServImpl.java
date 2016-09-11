package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import domain.User;
@Service
public class UserServImpl implements UserServ {

	private UserDao userDao;
	@Autowired
	@Qualifier("userDao")
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Transactional
	public Long add(User user) {
	
		return userDao.create(user);
	}
	@Transactional
	public User read(Long id) {
		// TODO Auto-generated method stub
		return userDao.read(id);
	}
	@Transactional
	public void update(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}
	@Transactional
	public void delete(User user) {
		// TODO Auto-generated method stub
		userDao.delete(user);
	}
	@Transactional
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}
	@Transactional
	public User Autontification(String login, String pass) {
		// TODO Auto-generated method stu\
		return userDao.findUserByloginAndPassword(login, pass);
	}

}
