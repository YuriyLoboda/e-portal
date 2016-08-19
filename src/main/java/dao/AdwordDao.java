package dao;

import java.util.List;

import domain.Adword;



public interface AdwordDao {
	Long create(Adword adword);
	Adword read(Long id);
	void update(Adword adword);
	void delete(Adword adword);
	List<Adword> findAll(String type);
}
