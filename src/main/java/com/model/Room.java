package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.*;


@Entity
@Table(name = "rooms")
public class Room {

	@Id
	private int room_id;
	private String room_type;

	@OneToMany(fetch=FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},orphanRemoval = true )
	List <Bed> bed;
	
	public Room() {
		super();
	}

	public Room(int room_id,String room_type) {
		super();
		this.room_id = room_id;
		this.room_type = room_type;
	}

	public long getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public String getRoom_type() {
		return room_type;
	}

	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}

	public List<Bed> getBed() {
		return bed;
	}

	public void setBed(List<Bed> bed) {
		this.bed = bed;
	}

}
