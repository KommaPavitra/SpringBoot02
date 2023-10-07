package com.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.model.Student;
import com.dl.repo.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repository;
	
	public StudentRepository getRepository() {
		return repository;
	}

	public void setRepository(StudentRepository repository) {
		this.repository = repository;
	}



	@Override
	public Student saveStudent(Student student) {
		
		return repository.save(student);
	}

	@Override
	public List<Student> getStudents() {
		
		return repository.findAll();
	}

}
 