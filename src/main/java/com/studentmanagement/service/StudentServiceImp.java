package com.studentmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagement.model.Student;
import com.studentmanagement.respository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{
	
	@Autowired
	private StudentRepository studRepo;

	@Override
	public List<Student> getAllStudent() {
		return this.studRepo.findAll();
	}

	@Override
	public Student getStudent(int id) {
		return this.studRepo.findById(id);
	}

	@Override
	public Student addStudent(Student student) {
		return this.studRepo.save(student);
	}

	@Override
	public String deleteStudent(int id) {
		Student s=this.studRepo.findById(id);
		if(s!=null)
		{
			this.studRepo.deleteById(id);
			return "Student Delete SuccessFully";
		}
		return "Something went wrong";
	}

	@Override
	public Student updateStudent(Student student, int id) {
		Student oldStudent=this.studRepo.findById(id);
		oldStudent.setName(student.getName());
		oldStudent.setAddress(student.getAddress());
		oldStudent.setEmail(student.getEmail());
		return this.studRepo.save(oldStudent);	
	}
	
	

}
