package domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="catalogs")
public class Catalog {
	@Id
	@GeneratedValue(generator = "increment2")
	@GenericGenerator(name = "increment2", strategy = "increment")
	private Long id;
	
	@Column(name="type")
	private String type;
	
	@OneToMany(mappedBy="catalog",fetch=FetchType.EAGER)
	@Cascade({CascadeType.ALL})
	private List<Adword> adwords;

	public Catalog() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Adword> getAdwords() {
		return adwords;
	}

	public void setAdwords(List<Adword> adwords) {
		this.adwords = adwords;
	}
	
}
