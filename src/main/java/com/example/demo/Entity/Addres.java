package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Addres {

	@Id
	private int pin;
	private String city;
	private String country;
	@ManyToOne
	private Student stu;
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	public Addres(int pin, String city, String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.country = country;
	}
	public Addres() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Addres [pin=" + pin + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
