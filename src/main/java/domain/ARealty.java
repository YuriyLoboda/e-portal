package domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class ARealty extends Adword {
	
	@Column(name = "adress")
	private String adress;

	@Column(name="squere")
	private Double squere;

	public ARealty() {
		super();
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Double getSquere() {
		return squere;
	}

	public void setSquere(Double squere) {
		this.squere = squere;
	}
	
}
