package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import domain.ARFlat;
import domain.ARHouse;
import domain.ARLand;
import domain.ASShoes;
import domain.ASWatches;
import domain.Adword;
import domain.Catalog;
import service.AdwordServImpl;
import service.CatalogServImpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("data-context.xml");
		AdwordServImpl serv = context.getBean("adwordServ",AdwordServImpl.class);
		
		
		
		CatalogServImpl cServ = context.getBean("catalogServ",CatalogServImpl.class);
		Catalog cat = new Catalog();
		cat.setType("Style");
		cServ.add(cat);
		ASShoes shoes = new ASShoes();
		shoes.setCatalog(1l);
		shoes.setDiscription("кожа");
		shoes.setSize(43.0);
		serv.add(shoes);
		
		cat=cServ.read(1l);
		List<Adword> list = cat.getAdwords();
		for(Adword ad: list){
			System.out.println(ad);
		}
		
	 
	
		
	}
	
}
