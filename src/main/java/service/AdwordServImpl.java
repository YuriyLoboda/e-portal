package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.AdwordDao;
import domain.Adword;
@Service
public class AdwordServImpl implements AdwordServ {

private AdwordDao adwordDao;
@Autowired
@Qualifier("adwordDao")
public void setAdwordDao(AdwordDao adwordDao) {
	this.adwordDao = adwordDao;
}
	
	
	@Transactional
	public Long add(Adword adword) {
		return adwordDao.create(adword);
	}

	@Transactional
	public Adword read(Long id) {
		return adwordDao.read(id);
	}

	@Transactional
	public void update(Adword adword) {
		adwordDao.update(adword);
		
	}

	@Transactional
	public void delete(Adword adword) {
		adwordDao.delete(adword);
		
	}

	@Transactional
	public List<Adword> findAll(String type) {
		return adwordDao.findAll(type);
	}

	
	

}
