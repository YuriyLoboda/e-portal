package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="watches")
public class ASWatches extends AStyle{

	@Column(name="mechanism")
	private String mechanism;

	public ASWatches() {
		super();
	}

	public String getMechanism() {
		return mechanism;
	}

	public void setMechanism(String mechanism) {
		this.mechanism = mechanism;
	}
	
	

}
