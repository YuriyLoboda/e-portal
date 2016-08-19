package service;

import java.util.List;

import domain.Adword;

public interface AdwordServ {
	Long add(Adword adword);
	Adword read(Long id);
	void update(Adword adword);
	void delete(Adword adword);
	List<Adword> findAll(String type);
}
