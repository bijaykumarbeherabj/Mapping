package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Student;

@Component
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
