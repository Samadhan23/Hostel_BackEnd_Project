package com.service;

import java.util.List;

import com.model.Room;

public interface RoomService {

	public Room addRoom(Room room);

	public Room getRoomById(int id);

	public List<Room> getAllRoom();

}
