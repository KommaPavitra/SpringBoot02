package com.dl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String empName;
	private String empJob;
	private String empAddress;
	private String empLocation;
	private double empSalary;
	private long empContact;
	
	public Employee() {
	}
	
	public Employee(int id, String empName, String empJob, String empAddress, String empLocation, double empSalary,long empContact) {
		this.id = id;
		this.empName = empName;
		this.empJob = empJob;
		this.empAddress = empAddress;
		this.empLocation = empLocation;
		this.empSalary = empSalary;
		this.empContact = empContact;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpJob() {
		return empJob;
	}

	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public long getEmpContact() {
		return empContact;
	}

	public void setEmpContact(long empContact) {
		this.empContact = empContact;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", empJob=" + empJob + ", empAddress=" + empAddress
				+ ", empLocation=" + empLocation + ", empSalary=" + empSalary + ", empContact=" + empContact + "]";
	}
	

}
