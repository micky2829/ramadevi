package com.example.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/st")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
	@GetMapping("/all")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	
	
	@GetMapping("/{name}")
	public Student getStudent(@PathVariable String name) {
		
		return 	studentService.getStudent(name);
				
				
	}
	
	@DeleteMapping("/{name}")
	public void deleteByName(@PathVariable String name) {
		studentService.deleteByName(name);
		
	}
}
