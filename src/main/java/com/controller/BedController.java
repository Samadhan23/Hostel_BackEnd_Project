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

import com.model.Bed;
import com.service.BedService;

@RestController
@RequestMapping("/b/")
@CrossOrigin(origins = "http://localhost:4200")
public class BedController {

	@Autowired
	BedService bedService;
	
	@PostMapping("add")
	public Bed addBed(@RequestBody Bed bed )
	{
		return bedService.addBed(bed);
	}
	
	@GetMapping("get/{id}")
	public Bed getBedById(@PathVariable("id") int id) {
		
		return bedService.getBedById(id);
	}	
	
	@GetMapping("getAll")
	public List<Bed>getAllBed()
	{
		return bedService.getAllBed();
	}
}
