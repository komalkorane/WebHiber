package com.prowings;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String roll;
	public Student(String name, String roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + "]";
	}
	
	
	
}
