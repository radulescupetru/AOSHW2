package com.unitbv.aoshw2.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + "]";
	}
	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private String email;
	
	public Person() {
		
	}
	
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
