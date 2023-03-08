package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Models.ParkingAvailability;

public interface ParkingRepo extends JpaRepository<ParkingAvailability,Integer>{
	
}
