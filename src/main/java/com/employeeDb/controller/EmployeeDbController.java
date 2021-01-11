package com.employeeDb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeDb.domain.Employee;
import com.employeeDb.domain.Employee_Information;
import com.employeeDb.service.EmployeeDbService;

@RestController
public class EmployeeDbController {
	
	@Autowired 
	private EmployeeDbService employeeDbService;
	
	@GetMapping("/employeeData")
	public List<Employee> getAllEmployeeData(){
		return employeeDbService.getAllEmployeeData();
	}
	
	@PostMapping("/addEmployeeData")
	public void addEmployeeData(@RequestBody Employee empData) {
		employeeDbService.addEmployeeData(empData);
	}
	
	@PutMapping("/updateEmployeeData")
	public void updateEmployeeData(@RequestBody Employee empData) {
		employeeDbService.updateEmployeeData(empData);
	}
	
	@GetMapping("/employeeInformation")
	public List<Employee_Information> getAllEmployeeInformation(){
		return employeeDbService.getAllEmployeeInformation();
	}
	
	@PostMapping("/addEmployeeInformation")
	public void addEmployeeInformation(@RequestBody Employee_Information empInfo) {
		employeeDbService.addEmployeeInformation(empInfo);
	}
	
	@PutMapping("/updateEmployeeInformation")
	public void updateEmployeeInformation(@RequestBody Employee_Information empInfo) {
		employeeDbService.updateEmployeeInformation(empInfo);
	}

}
