package com.service;

import com.model.Hostel;

import java.util.*;

public interface HostelService {

	Hostel addHostel(Hostel hostel);

	Hostel addHostels(Hostel hostel);

	Hostel getHostelById(int id);

	void deleteHostel(int id);

	List<Hostel> getAllHostel();
}
