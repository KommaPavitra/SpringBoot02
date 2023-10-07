package com.dl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dl.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
