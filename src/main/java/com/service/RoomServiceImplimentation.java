package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BedRepository;
import com.dao.RoomRepository;
import com.model.Room;

import HostelExceptions.RoomNotFound;

@Service
public class RoomServiceImplimentation implements RoomService {

	@Autowired
	RoomRepository roomRepo;
	
	@Autowired
	BedRepository bedRepo;

	@Override
	public Room addRoom(Room room) {
		// TODO Auto-generated method stub
		return roomRepo.save(room);
	}

	@Override
	public Room getRoomById(int id) {
		// TODO Auto-generated method stub
		return roomRepo.findById(id).orElseThrow(
				()-> 
				new RoomNotFound("There no Such Rooom fount of this id" +id));
	}

	@Override
	public List<Room> getAllRoom() {
		// TODO Auto-generated method stub
		return roomRepo.findAll();
	}
	
}
