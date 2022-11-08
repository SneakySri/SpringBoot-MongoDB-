package com.restuarant.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Resturant {
	@Id
	private Long rId;
	private String name;
	private String address;
	public Resturant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resturant(Long rId, String name, String address) {
		super();
		this.rId = rId;
		this.name = name;
		this.address = address;
	}
	public Long getrId() {
		return rId;
	}
	public void setrId(Long rId) {
		this.rId = rId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
