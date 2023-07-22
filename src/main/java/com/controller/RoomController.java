package com.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Room;
import com.service.RoomService;

@RestController
@RequestMapping("/r/")
@CrossOrigin(origins = "http://localhost:4200")

public class RoomController {

	@Autowired
	RoomService roomService;
	
//	@PostMapping("add/")
//	public Room addRoom( Room room)
//	{
//		return roomService.addRoom(room);		
//	}
	
	@PostMapping("add")
	public Room addRoom(@RequestBody Room room )
	{
		return roomService.addRoom(room);		
	}

	@GetMapping("get/{id}")
	public Room getRoomById(@PathVariable("id") int id) {
		
		return roomService.getRoomById(id);
	}	
	
	@GetMapping("getAll")
	public List<Room>getAllRoom()
	{
		return roomService.getAllRoom();
	}
	
	
	
}
