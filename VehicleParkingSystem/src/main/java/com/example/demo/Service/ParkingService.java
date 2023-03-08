package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Models.ParkingAvailability;
import com.example.demo.Repository.ParkingRepo;

@Service
public class ParkingService {
	@Autowired
	ParkingRepo repository;
	public List<ParkingAvailability> getal()
	{
		return repository.findAll();
	}
	public ParkingAvailability Posting(@RequestBody ParkingAvailability val) 
	{
		return repository.save(val);
	}
	public String Putting(@RequestBody ParkingAvailability id)
	{
		repository.save(id);
		return "Updated";
	}
	public String Deleteing(int slot_number)
	{
		repository.deleteById(slot_number);
		return "deleted";
	}

}
