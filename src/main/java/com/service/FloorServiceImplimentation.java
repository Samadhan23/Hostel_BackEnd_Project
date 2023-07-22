package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FloorRepository;
import com.model.Floor;

@Service
public class FloorServiceImplimentation implements FloorService {

	@Autowired
	FloorRepository floorRepo;
	
	@Override
	public Floor addFloor(Floor floor) {
		// TODO Auto-generated method stub
		return floorRepo.save(floor);
	}

}
