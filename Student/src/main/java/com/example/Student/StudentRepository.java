package com.example.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public void deleteByName(String name);
	
	public Student getByname(String name);

}
