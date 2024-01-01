package com.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagement.model.Student;
import com.studentmanagement.service.StudentService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentControlller {
	
	@Autowired
	private StudentService studser;
	
	@GetMapping("/Student")
	public ResponseEntity<?> getAllStudent()
	{
		return new ResponseEntity<>(studser.getAllStudent(),HttpStatus.OK);
	}
	
	@GetMapping("/Student/{id}")
	public ResponseEntity<?> getStudent(@PathVariable("id") int id)
	{
		return new ResponseEntity<>(studser.getStudent(id),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addStudent(@RequestBody Student student)
	{
		return new ResponseEntity<>(studser.addStudent(student),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable("id") int id)
	{
		return new ResponseEntity<>(studser.deleteStudent(id),HttpStatus.OK);
	}
	
	@PostMapping("/update/{id}")
	public ResponseEntity<?> updateStudent(@RequestBody Student student,@PathVariable("id") int id)
	{
		return new ResponseEntity<>(studser.updateStudent(student, id),HttpStatus.OK);
	}
	
	
	

}
