package com.std.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.std.management.entitiy.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
