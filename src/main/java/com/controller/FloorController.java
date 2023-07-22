package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Floor;
import com.service.FloorService;

@RestController
@RequestMapping("/f/")
public class FloorController {

	@Autowired
	FloorService floorService;
	
	@PostMapping("add")
	public Floor addFloor(@RequestBody Floor floor )
	{
		return floorService.addFloor(floor);
	}
	
}
