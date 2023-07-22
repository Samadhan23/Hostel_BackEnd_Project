package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table (name = "beds")
public class Bed {

	@Id
	private int bed_id;
	private boolean availability=true;
 	
	public Bed() {
		super();
	}

	public Bed(int bed_id, boolean availability) {
		super();
		this.bed_id = bed_id;
		this.availability = availability;
	}

	public long getBed_id() {
		return bed_id;
	}

	public void setBed_id(int bed_id) {
		this.bed_id = bed_id;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}	
	
	
}
