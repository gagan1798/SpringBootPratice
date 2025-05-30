package com.gagan.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gagan.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
