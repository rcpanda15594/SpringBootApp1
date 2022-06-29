package com.example.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.emp.model.Employee;
import com.example.emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
	@GetMapping("/getAllEmployee")
	public List<Employee> empList(){
		return service.empList();
	}
}
