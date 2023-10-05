package com.dl.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.Employee;
import com.dl.service.EmployeeService;



@RestController
@RequestMapping("/api/vs1")
public class EmployeeController {

	

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> get(){
		
		List<Employee> findAllEmployees = employeeService.findAllEmployees();
		return new ResponseEntity<List<Employee>>(findAllEmployees, HttpStatus.OK);
}
	@PostMapping("/saveEmployees")
	public ResponseEntity<Employee>save(@RequestBody Employee employee){
		Employee employees = employeeService.save(employee);
		return new ResponseEntity<Employee>(employees,HttpStatus.OK);
		
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteUser(@PathVariable("id") Integer id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<>("Employee record deleted: ",HttpStatus.OK);
		
	}
	@PutMapping("{id}")
	public ResponseEntity<Employee>upadteEmployee(@PathVariable("id") Integer id, @RequestBody Employee employee){
		employee.setId(id);
		Employee empupdated = employeeService.updateEmployee(employee);
		return new ResponseEntity<>(empupdated,HttpStatus.ACCEPTED);
		
	}
}