package com.std.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.std.management.entitiy.Student;
import com.std.management.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Student student2 = new Student("Soumia", "Saikouk", "Soumia.saikouk@gmail.com");
//		studentRepository.save(student2);
//		Student student1 = new Student("ISSAME", "Lamchabrag", "Lamchabragissame.112@gmail.com");
//		studentRepository.save(student1);
//		Student student3 = new Student("AMINE", "Lamchabrag", "Lamchabragamine.112@gmail.com");
//		studentRepository.save(student3);
	}

}
