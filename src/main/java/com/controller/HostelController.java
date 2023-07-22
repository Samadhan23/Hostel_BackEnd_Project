package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Hostel;

import com.service.HostelService;

import java.util.*;

@RestController
//@RequestMapping("/h/")
@CrossOrigin(origins = "http://localhost:4200")
public class HostelController {

	@Autowired
	HostelService hostelService;
	
	@PostMapping("add")
	public Hostel addHostel(@RequestBody Hostel hostel)
	{
		return hostelService.addHostel(hostel);
	}
	
	@PostMapping("map")
	public ResponseEntity<Hostel> addHostels(@RequestBody Hostel hostel) {
		Hostel h =  hostelService.addHostels(hostel);
		return ResponseEntity.status(HttpStatus.CREATED).header("Add", "Hostel created").body(h);
	
	}
	
	@GetMapping("get/{id}")
	public Hostel getHostelById(@PathVariable("id") int id) {
		
		return hostelService.getHostelById(id);
	}	
	
	@GetMapping("getAll")
	public List<Hostel>getAllHostel()
	{
		return hostelService.getAllHostel();
	}
	
	
	@PutMapping("update")
	public Hostel hostelRepo(@RequestBody Hostel Hostel) {
        return hostelService.addHostel(Hostel);
    }
	
	@DeleteMapping("delete/{id}")
	public Hostel deleteHostel(int id) {
		hostelService.deleteHostel(id);
		return null ;
	}
}
 