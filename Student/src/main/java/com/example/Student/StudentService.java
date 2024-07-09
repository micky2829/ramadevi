package com.example.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
	
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}
	
	
	public Student getStudent(String name) {
		return studentRepository.getByname(name);
	}
	
	public void deleteByName(String name) {
		studentRepository.deleteByName(name);
	}

}
