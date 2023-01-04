package com.nagarro.jenkinsDockerDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarro.jenkinsDockerDemo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	List<Employee> employeeList= new ArrayList<>();
	
	public EmployeeServiceImpl() {
		employeeList.add(new Employee(1011,"Aman"));
		employeeList.add(new Employee(1102,"Dipankar"));
		employeeList.add(new Employee(1103,"Divyansh"));
		employeeList.add(new Employee(1104,"Priya"));
		
	}
	@Override
	public List<Employee> getAllEmployee() {
		return this.employeeList;
	}

}
