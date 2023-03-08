package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.ParkingAvailability;
import com.example.demo.Repository.ParkingRepo;
import com.example.demo.Service.ParkingService;

@CrossOrigin
@RestController
public class ParkingController {
	@Autowired
	ParkingRepo servicerepository;
	@Autowired
	ParkingService service;
	
	
	@GetMapping("/get")
	public List<ParkingAvailability> gett()
	{
		return service.getal();
	}
	@PostMapping("/post")
	public ParkingAvailability post(@RequestBody ParkingAvailability val) {
		return service.Posting(val);
	}
	@PutMapping("/put")
	public String put(@RequestBody ParkingAvailability id)
	{
		return service.Putting(id);
	}
	@DeleteMapping("/delete")
	public String delete(@RequestParam int slot_number){
		return service.Deleteing(slot_number);
	}
}
