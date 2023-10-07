package com.dl.service;

import java.util.List;

import com.dl.model.Student;

public interface StudentService {

	Student saveStudent(Student student);
	
	List<Student> getStudents();

}
