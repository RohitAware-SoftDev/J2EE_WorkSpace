package com.jspiders.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springboot.pojo.EmployeePOJO;
import com.jspiders.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServices {

	@Autowired
	private EmployeeRepository repository;

	public EmployeePOJO addEmployee(EmployeePOJO employee) {
		EmployeePOJO pojo = repository.save(employee);
		return pojo;
	}

	public EmployeePOJO searchEmployee(int id) {
		EmployeePOJO pojo = repository.findById(id).orElse(null);
			return pojo;
		
	}

	public void deleteEmployee(int id) {
		if(id != 0) {
			 repository.deleteById(id);
		}
	}

	public List<EmployeePOJO> getAllEmployee() {
		List<EmployeePOJO> list = new ArrayList();
		repository.findAll().forEach(list::add);
		return list;
	}

	public EmployeePOJO update(EmployeePOJO employee, int id) {
		EmployeePOJO pojo = repository.findById(id).orElse(null);
		pojo.setName(employee.getName());
		pojo.setEmail(employee.getEmail());
		pojo.setContact(employee.getContact());
		pojo.setDesignation(employee.getDesignation());
		pojo.setSalary(employee.getSalary());
		EmployeePOJO emp=  repository.save(pojo);
		
			return emp;
	}
	
}
