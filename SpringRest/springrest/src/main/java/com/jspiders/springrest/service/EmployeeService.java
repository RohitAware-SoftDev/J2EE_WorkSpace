package com.jspiders.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springrest.pojo.EmployeePOJO;
import com.jspiders.springrest.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	
	public EmployeePOJO addEmployee(EmployeePOJO employee) {
		EmployeePOJO pojo = repository.addEmployee(employee);
		return pojo;
	}

	public EmployeePOJO searchEmployee(int id) {
		EmployeePOJO employee = repository.searchEmployee(id);
		return employee;
	}
	

	public EmployeePOJO updateEmployee(EmployeePOJO employee,int id) {
		EmployeePOJO pojo =	repository.updateEmployee(employee, id);
		return pojo;
	}

	public void deleteEmployee(int id) {
	  repository.deleteEmployee(id);
	}
}
