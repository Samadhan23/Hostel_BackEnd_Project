package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Floor;

public interface FloorRepository extends JpaRepository<Floor, Long> {

}
