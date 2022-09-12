package com.test.SBA.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.SBA.exception.UserNotFoundException;
import com.test.SBA.passenger.Passenger;
import com.test.SBA.service.PassengerService;

@RestController
public class PassengerController {
	
	@Autowired
	private PassengerService passervice;
	
	@RequestMapping("/device")
	public List<Passenger> getAllPassengers()
	{
		List<Passenger> pas =passervice.getAllPassengers();
		if(pas.size()<=0)
			throw new UserNotFoundException("Sorry Devices are not Present");
		return pas;
	}
	
	@GetMapping("/device/{id}")
	public Passenger getPassenger(@PathVariable int id)
	{
		Passenger pas=passervice.getPassenger(id);
		
		if(pas==null)
			
			throw new UserNotFoundException("Id is not present");
		return pas;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/device")
	public void addPassenger(@RequestBody Passenger pas)
	{
		passervice.addPassenger(pas);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/device/{id}")
	public void UpdatePassenger(@PathVariable int id ,@RequestBody Passenger pas)
	{
		passervice.addPassenger(pas);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/device/{id}")
	public void UpdatePassenger(@PathVariable int id )
	{
		passervice.deletePassenger(id);
	}

}
