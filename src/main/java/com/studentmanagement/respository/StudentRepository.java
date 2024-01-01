package com.studentmanagement.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagement.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	public Student findById(int id);
}
