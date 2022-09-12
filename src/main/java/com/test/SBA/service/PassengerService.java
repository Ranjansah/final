package com.test.SBA.service;


import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.SBA.passenger.Passenger;
import com.test.SBA.repository.PassengerRepository;

@Service
public class PassengerService {
	
	@Autowired
	public PassengerRepository pasRepo;
	
	public List<Passenger> getAllPassengers()
	{
		List<Passenger> pass=new ArrayList<>();

		
		pasRepo.findAll().forEach(pass::add);
		return pass;
	}
	
	public Passenger getPassenger(int id)
	{
		try
		{
			return pasRepo.findById(id).get();
		}
		catch(Exception e)
		{
			return null;
		}
		
		
	}
	
	public void addPassenger(Passenger pas)
	{
		pasRepo.save(pas);
	}

	public void updatePassenger(int  id, Passenger pas)
	{
		pasRepo.save(pas);
	}
	
	public void deletePassenger(int id)
	{
		pasRepo.deleteById(id);
	}

}
