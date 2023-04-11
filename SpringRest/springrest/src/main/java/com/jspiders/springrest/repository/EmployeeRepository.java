package com.jspiders.springrest.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.jspiders.springrest.pojo.EmployeePOJO;
import javax.persistence.Query;

@Repository
public class EmployeeRepository {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Query query;
	private String jpql;
	
	public static void openConnection() {
		factory=Persistence.createEntityManagerFactory("emp");
		manager=factory.createEntityManager();
		transaction=manager.getTransaction();
	}
	
	public static void closeConnection() {
		if(factory!=null) {
			factory.close();
		}
		if(manager!=null) {
			manager.close();
		}
		if(transaction.isActive()) {
			transaction.rollback();
		}
	}

	public EmployeePOJO addEmployee(EmployeePOJO employee) {
		openConnection();
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
		closeConnection();
		return employee;
	}

	public EmployeePOJO searchEmployee(int id) {
		openConnection();
		transaction.begin();
		EmployeePOJO employee = manager.find(EmployeePOJO.class, id);
		transaction.commit();
		closeConnection();
		return employee;
	}

	
	
	public EmployeePOJO updateEmployee(EmployeePOJO employee,int id) {
		openConnection();
		transaction.begin();
		EmployeePOJO pojo = manager.find(EmployeePOJO.class, id);
		pojo.setName(employee.getName());
		pojo.setEmail(employee.getEmail());
		pojo.setContact(employee.getContact());
		pojo.setDesignation(employee.getDesignation());
		pojo.setSalary(employee.getSalary());
		manager.persist(pojo);
		transaction.commit();
		closeConnection();
		return pojo;
	}

	public void deleteEmployee(int id) {
		openConnection();
		transaction.begin();
		EmployeePOJO pojo =manager.find(EmployeePOJO.class,id);
		manager.remove(pojo);
		transaction.commit();
		closeConnection();
	}
}
