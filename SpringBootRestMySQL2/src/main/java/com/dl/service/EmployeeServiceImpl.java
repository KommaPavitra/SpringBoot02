package com.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.model.Employee;
import com.dl.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repository;

	@Override
	public List<Employee> findAllEmployees() {
		
		return repository.findAll();
	}

	@Override
	public Employee save(Employee employee) {
	repository.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee update = repository.findById(employee.getId()).get();
		update.setEmpName(employee.getEmpName());
		update.setEmpJob(employee.getEmpJob());
		update.setEmpSalary(employee.getEmpSalary());
		update.setEmpLocation(employee.getEmpLocation());
		update.setEmpContact(employee.getEmpContact());
		update.setEmpAddress(employee.getEmpAddress());
		Employee updated = repository.save(update);
		return updated;
	}
	
	

}
