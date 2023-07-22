package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "floors")
public class Floor {

	@Id
	private Long floor_id;
	
	public Floor() {
		super();
	}

	public Floor(Long floor_id) {
		super();
		this.floor_id = floor_id;
	}

	public Long getFloor_id() {
		return floor_id;
	}

	public void setFloor_id(Long floor_id) {
		this.floor_id = floor_id;
	}

	
}
