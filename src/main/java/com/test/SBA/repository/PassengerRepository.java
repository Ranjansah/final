package com.test.SBA.repository;

import org.springframework.data.repository.CrudRepository;


import com.test.SBA.passenger.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger ,Integer> {


}