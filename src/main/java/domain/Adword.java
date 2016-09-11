package domain;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Adword {

	@Id
	@GeneratedValue(generator = "increment2")
	@GenericGenerator(name = "increment2", strategy = "increment")
	private Long id;
	@Override
	public String toString() {
		return "Adword [id=" + id + ", type=" + type + ", price=" + price + ", publicDate=" + publicDate + ", catalog="
				+ catalog + ", user=" + user + ", discription=" + discription + "]";
	}

	@Column(name="type")
	private String type;
	
	@Column(name="price")
	private String price;
	
	@Column(name="publicDate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date publicDate;
	
	
	@Column(name="catalog")
	private Long catalog;
	
	@Column(name="user")
	private Long user;

	public Long getCatalog() {
		return catalog;
	}

	public void setCatalog(Long catalog) {
		this.catalog = catalog;
	}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	@Column(name="discription")
	private String discription;
	


	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Adword() {
		this.publicDate=Calendar.getInstance().getTime();
	}

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getPublicDate() {
		return publicDate;
	}

	public void setPublicDate(Date publicDate) {
		this.publicDate = publicDate;
	}


}
