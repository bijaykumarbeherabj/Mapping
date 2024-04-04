package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Category;

public interface Categoryrepo extends JpaRepository<Category,String> {



}
