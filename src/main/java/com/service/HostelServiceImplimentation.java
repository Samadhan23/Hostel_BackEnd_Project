package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.HostelRepository;
import com.model.Hostel;


import HostelExceptions.HostelNotFound;

@Service
public class HostelServiceImplimentation implements HostelService {

	@Autowired
	HostelRepository hostelRepo;

	@Override
	public Hostel addHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		return hostelRepo.save(hostel);
	}

	@Override
	public Hostel addHostels(Hostel hostel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hostel getHostelById(int id) {
		// TODO Auto-generated method stub
		return hostelRepo.findById(id).orElseThrow(
				()-> 
				new HostelNotFound("There no Such Hostel fount of this id" +id));
	}

	@Override
	public void deleteHostel(int id) {
		// TODO Auto-generated method stub
		hostelRepo.deleteById(id);
		
	}

	@Override
	public List<Hostel> getAllHostel() {
		// TODO Auto-generated method stub
		return hostelRepo.findAll();
	}
	
}
