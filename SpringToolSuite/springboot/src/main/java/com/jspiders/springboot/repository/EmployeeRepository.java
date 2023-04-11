package com.jspiders.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspiders.springboot.pojo.EmployeePOJO;

public interface EmployeeRepository extends JpaRepository<EmployeePOJO, Integer>{

//	JpaRepository Internally extends to QueryByExampleExecutor which provides the 
//	CURD operation methods
}
