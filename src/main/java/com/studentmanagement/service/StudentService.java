package com.studentmanagement.service;

import java.util.List;

import com.studentmanagement.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudent();
	
	public Student getStudent(int id);
	
	public Student addStudent(Student student);
	
	public String deleteStudent(int id);
	
	public Student updateStudent(Student student,int id);
	

}
