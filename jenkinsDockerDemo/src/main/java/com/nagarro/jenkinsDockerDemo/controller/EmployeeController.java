package com.nagarro.jenkinsDockerDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.jenkinsDockerDemo.model.Employee;
import com.nagarro.jenkinsDockerDemo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> allEmployees=employeeService.getAllEmployee();
		return new ResponseEntity<List<Employee>>(allEmployees,HttpStatus.OK);
	}

}
