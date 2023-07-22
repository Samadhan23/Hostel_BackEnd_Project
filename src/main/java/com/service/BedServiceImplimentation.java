package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BedRepository;
import com.model.Bed;

import HostelExceptions.BedNotFound;

@Service
public class BedServiceImplimentation implements BedService {

	@Autowired
	BedRepository bedRepo;
	
	@Override
	public Bed addBed(Bed bed) {
		// TODO Auto-generated method stub
		return bedRepo.save(bed);
	}

	@Override
	public Bed getBedById(int id) {
		// TODO Auto-generated method stub
		return bedRepo.findById(id).orElseThrow(
				()-> 
				new BedNotFound("There no Such Bed fount of this id" +id));			
	}

	@Override
	public List<Bed> getAllBed() {
		// TODO Auto-generated method stub
		return bedRepo.findAll();
	}

}
