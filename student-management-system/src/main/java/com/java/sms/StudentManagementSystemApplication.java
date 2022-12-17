package com.java.sms;

import com.java.sms.entity.Student;
import com.java.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Student student = new Student("Chaitanya","Annam","chaitu.annm@gmail.com");
		studentRepository.save(student);
		student = new Student("Sanjay","jadev","sanjay.J@gmail.com");
		studentRepository.save(student);
		student = new Student("Tony","stark","tony.S@gmail.com");
		studentRepository.save(student);*/
	}
}
