package com.gagan.springdatajpa;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.gagan.springdatajpa.entities.Student;
import com.gagan.springdatajpa.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	StudentRepository studentRepo;
	
	@Test
	void testStudent() {
		Student student = new Student();
		
		student.setId(100);
		student.setName("Rohith");
		student.setTestScores(100);
		
		//create
		studentRepo.save(student);
		
		//read
		Student savedStudent = studentRepo.findById(100l).get();
		
		assertNotNull(savedStudent);
		assertEquals("Rohith", savedStudent.getName());
		
		//update
		savedStudent.setTestScores(98);
		studentRepo.save(savedStudent);
		
		Student updatedStudent = studentRepo.findById(100l).get();
		
		assertNotNull(updatedStudent);
		assertEquals(98, savedStudent.getTestScores());
		
		//delete
		studentRepo.deleteById(100l);
		Optional<Student> studentOpt = studentRepo.findById(100l);
		assert(studentOpt.isEmpty());
		
	}

}
