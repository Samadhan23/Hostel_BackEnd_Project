package com.model;




import javax.persistence.Entity;

import javax.persistence.Id;


import javax.persistence.Table;

@Entity
@Table (name = "hostels")
public class Hostel {

	@Id
	private int hostel_id;
	private String hostel_name;
	private String city;
	private String address_Line1;
	private String address_Line2;
	
//	@OneToMany(fetch=FetchType.EAGER,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH},orphanRemoval = true )
//	List <Room> room;
//	
//	@OneToOne
//	private User user;
	
	public Hostel() {
		super();
	}

	public Hostel(int hostel_id , String hostel_name, String city, String address_Line1, String address_Line2) {
		super();
		this.hostel_id = hostel_id;
		this.hostel_name=hostel_name;
		this.city = city;
		this.address_Line1 = address_Line1;
		this.address_Line2 = address_Line2;
	}

	public long getHostel_id() {
		return hostel_id;
	}

	public void setHostel_id(int hostel_id) {
		this.hostel_id = hostel_id;
	}

	public String getHostel_name() {
		return hostel_name;
	}

	public void setHostel_name(String hostel_name) {
		this.hostel_name = hostel_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress_Line1() {
		return address_Line1;
	}

	public void setAddress_Line1(String address_Line1) {
		this.address_Line1 = address_Line1;
	}

	public String getAddress_Line2() {
		return address_Line2;
	}

	public void setAddress_Line2(String address_Line2) {
		this.address_Line2 = address_Line2;
	}
//
//	public List<Room> getRoom() {
//		return room;
//	}
//
//	public void setRoom(List<Room> room) {
//		this.room = room;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
	
}
