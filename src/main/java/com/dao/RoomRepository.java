package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Room;

public interface RoomRepository extends JpaRepository<Room, Integer>{

}
