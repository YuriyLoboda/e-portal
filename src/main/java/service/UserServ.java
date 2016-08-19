package service;

import java.util.List;

import domain.User;

public interface UserServ {
	Long add(User catalog);
	User read(Long id);
	void update(User catalog);
	void delete(User catalog);
	List<User> findAll();
}
