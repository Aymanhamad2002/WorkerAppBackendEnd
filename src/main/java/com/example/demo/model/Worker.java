package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Worker {
	@Id
	private int id ;
	private String name;
	private String shift;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	

}
