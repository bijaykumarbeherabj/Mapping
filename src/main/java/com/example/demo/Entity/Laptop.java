package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Tab_Laptops")
public class Laptop {
	@Id
 private int idno;
 private String name;
 private String color;
 
 @OneToOne
 private Student students;
 
 public int getIdno() {
	return idno;
}

public void setIdno(int idno) {
	this.idno = idno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public Student getStudents() {
	return students;
}

public void setStudents(Student students) {
	this.students = students;
}

public Laptop(int idno, String name, String color, Student students) {
	super();
	this.idno = idno;
	this.name = name;
	this.color = color;
	this.students = students;
}

public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Laptop [idno=" + idno + ", name=" + name + ", color=" + color + ", students=" + students + "]";
}
 
}
