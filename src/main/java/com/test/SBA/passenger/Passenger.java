package com.test.SBA.passenger;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mile")
public class Passenger {
	
	
	private int id;
	private String age;
	private String name;
	private String source;
	private String destination;
	
	
	public Passenger()
	{
		
	}


	public Passenger(int id, String age, String name, String source, String destination) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.source = source;
		this.destination = destination;
	}

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSource() {
		return source;
	}


	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String toString() 
	{
		return "Passenger[Id=" + id +", Age=" + age +" name=" + name +",Source=" + source +", Destination="+destination+"]";
	} 
	
	
}