package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="shoes")
public class ASShoes extends AStyle {
	
	@Column(name="size")
	private Double size;

	public ASShoes() {
		super();
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}

	
}
