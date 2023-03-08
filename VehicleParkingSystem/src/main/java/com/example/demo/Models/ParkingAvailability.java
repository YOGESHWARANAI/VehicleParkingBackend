package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ParkingAvailability {
	@Id
	private int slot_number;
	private String registration_plate_number;
	private String name;
	private String time_taken;
	private int passcode;
	private boolean availability;
	public ParkingAvailability(int slot_number, String registration_plate_number, String name, String time_taken,
			int passcode, boolean availability) {
		super();
		this.slot_number = slot_number;
		this.registration_plate_number = registration_plate_number;
		this.name = name;
		this.time_taken = time_taken;
		this.passcode = passcode;
		this.availability = availability;
	}
	public ParkingAvailability() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSlot_number() {
		return slot_number;
	}
	public void setSlot_number(int slot_number) {
		this.slot_number = slot_number;
	}
	public String getRegistration_plate_number() {
		return registration_plate_number;
	}
	public void setRegistration_plate_number(String registration_plate_number) {
		this.registration_plate_number = registration_plate_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTime_taken() {
		return time_taken;
	}
	public void setTime_taken(String time_taken) {
		this.time_taken = time_taken;
	}
	public int getPasscode() {
		return passcode;
	}
	public void setPasscode(int passcode) {
		this.passcode = passcode;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	
}
