package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Bed;

public interface BedRepository extends JpaRepository<Bed, Integer> {

}
