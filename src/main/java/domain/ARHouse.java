package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="house")
public class ARHouse extends ARealty {

	
	
	@Column(name = "rooms")
	private int room;
	
	@Column(name="floors")
	private int floors;
	
	@Column(name="land")
	private Double land;
	
	

	public ARHouse() {
		super();
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public Double getLand() {
		return land;
	}

	public void setLand(Double land) {
		this.land = land;
	}
	
}
