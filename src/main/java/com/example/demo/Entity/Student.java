package com.example.demo.Entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="Tab_Students")
public class Student {
	@Id
	private int id;
	private int roll;
	private String name;
	
	@OneToOne(mappedBy ="students",cascade = CascadeType.ALL)
	private Laptop laptop;
	
	@OneToMany(mappedBy = "stu",cascade = CascadeType.ALL)
	 private List <Addres>addreslist=new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public List<Addres> getAddreslist() {
		return addreslist;
	}
	public void setAddreslist(List<Addres> addreslist) {
		this.addreslist = addreslist;
	}
	public Student(int id, int roll, String name, Laptop laptop) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
		this.laptop = laptop;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", name=" + name + ", laptop=" + laptop + "]";
	}
	
}
