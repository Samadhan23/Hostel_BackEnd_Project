package com.service;

import java.util.List;

import com.model.Bed;
public interface BedService {

	Bed addBed(Bed bed);

	Bed getBedById(int id);

	List<Bed> getAllBed();

}
