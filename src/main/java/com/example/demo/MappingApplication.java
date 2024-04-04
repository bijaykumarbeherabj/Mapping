package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Addres;
import com.example.demo.Entity.Category;
import com.example.demo.Entity.Laptop;
import com.example.demo.Entity.Product;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.Categoryrepo;
import com.example.demo.Repository.Productrepo;
import com.example.demo.Repository.StudentRepo;

@SpringBootApplication
public class MappingApplication implements  CommandLineRunner {
	@Autowired
	  StudentRepo studentrepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MappingApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
//		Student std=new Student();
//		std.setId(1);
//		std.setName("Bijay");
//		std.setRoll(12);
//	
//		Laptop lp=new Laptop();
//		lp.setIdno(1);
//		lp.setName("Dell");
//		lp.setColor("White");
//		
//		lp.setStudents(std);
//		std.setLaptop(lp);
//		
//		 Student st=studentrepo.save(std);
//		 
//		
//		Student std=new Student();
//		std.setId(2);
//		std.setName("Bijay");
//		std.setRoll(12);
//		
//		Addres add=new Addres();
//		add.setPin(123);
//		add.setCity("Balasore");
//		add.setCountry("india");
//	    add.setStu(std); 
//		
//		Addres add1=new Addres();
//		add1.setPin(124);
//		add1.setCity("Bhadrak");
//		add1.setCountry("india");
//		add1.setStu(std);
//		
//		
//		List addreslist=new ArrayList();
//		addreslist.add(add);
//		addreslist.add(add1);
//		
//	    std.setAddreslist(addreslist);
//		Student save= studentrepo.save(std);
//		System.out.println(save);
		
		Category category=new Category();
		category.setId("101");
		category.setName("Electronic");
		
		Category category1=new Category();
		category1.setId("102");
		category1.setName("Plactisc");
		
		Product product=new Product();
		product.setId("12");
		product.setName("Mobile");
		
		Product product1=new Product();
		product1.setId("10");
		product1.setName("Laptop");
		
		Product product2=new Product();
		product2.setId("13");
		product2.setName("Tv");
		
		List<Product> categoryProducts=category.getProduct();
		categoryProducts.add(product);
		categoryProducts.add(product1);
		categoryProducts.add(product2);
		
		List<Product>categoryProducts1=category1.getProduct();
		categoryProducts1.add(product);
		categoryProducts1.add(product1);
		categoryProducts1.add(product2);
		
		
		 categoryrepo.save(category);
		 categoryrepo.save(category1);
		
	}
	@Autowired
	Categoryrepo categoryrepo;
	@Autowired
	Productrepo productrepo;
	

}
