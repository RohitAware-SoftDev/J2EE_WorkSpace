package com.jspiders.springboot.controller;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.springboot.pojo.EmployeePOJO;
import com.jspiders.springboot.responce.EmployeeResponse;
import com.jspiders.springboot.service.EmployeeServices;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServices services;
	
	@GetMapping(path ="/search")
	public ResponseEntity<EmployeeResponse> searchEmployee(@RequestParam int id){
		EmployeePOJO pojo = services.searchEmployee(id);
		if (pojo != null) {
			//Success
			return new ResponseEntity<EmployeeResponse>(new EmployeeResponse("OK", "Employee data found. ", pojo, null), HttpStatus.FOUND);
		}
		//Failure
		return new ResponseEntity<EmployeeResponse>(new EmployeeResponse("FAIL", "Employee data not found. ", null, null), HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/searchAll")
	public ResponseEntity<List<EmployeePOJO>> getAllEmployee(){
		List<EmployeePOJO> list = services.getAllEmployee();
		if(list != null) {
	 		return new  ResponseEntity<List<EmployeePOJO>>(list,HttpStatus.ACCEPTED);
	 	}
 		return new  ResponseEntity<List<EmployeePOJO>>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/add")
	public ResponseEntity<EmployeeResponse> addEmployee(@RequestBody EmployeePOJO employee){
		
	 	EmployeePOJO pojo = services.addEmployee(employee);
	 	if(pojo != null) {
	 		return new ResponseEntity<EmployeeResponse>(new EmployeeResponse("OK", "Employee Added Successfully", pojo, null),HttpStatus.ACCEPTED);
	 	}
 		return new ResponseEntity<EmployeeResponse>(new EmployeeResponse("OK", "Employee Added Successfully", null, null),HttpStatus.BAD_REQUEST);
	}
	
	
	@DeleteMapping("/delete")
	public String deleteEmployee(@RequestParam int id){
			services.deleteEmployee(id);
		return "Deleted Successfully";
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<EmployeeResponse> updateEmployee(@RequestBody EmployeePOJO employee ,@RequestParam int id) {
		EmployeePOJO pojo  = services.update(employee,id);
		if(pojo!=null) {
			//Success
			return new ResponseEntity<EmployeeResponse>(new EmployeeResponse("OK", "Employee data found. ", pojo, null), HttpStatus.FOUND);
		}
		//Failure
		return new ResponseEntity<EmployeeResponse>(new EmployeeResponse("FAIL", "Employee data not found. ", null, null), HttpStatus.NOT_FOUND);
	}
}
