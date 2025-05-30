package com.gagan.springdatajpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private long id;
	private String name;
	private int testScores;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTestScores() {
		return testScores;
	}

	public void setTestScores(int testScores) {
		this.testScores = testScores;
	}

}
