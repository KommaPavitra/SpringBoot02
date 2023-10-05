package com.dl.service;

import java.util.List;

import com.dl.model.Employee;

public interface EmployeeService {
	List<Employee> findAllEmployees();
	Employee save(Employee employee);
	void deleteEmployee(Integer id);
	Employee updateEmployee(Employee employee);

}
