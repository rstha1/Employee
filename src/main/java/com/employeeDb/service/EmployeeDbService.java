package com.employeeDb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeDb.domain.Employee;
import com.employeeDb.domain.Employee_Information;
import com.employeeDb.repository.EmployeeRepository;
import com.employeeDb.repository.Employee_InformationRepository;

@Service
public class EmployeeDbService {
	
	@Autowired
	private Employee_InformationRepository employee_InformationRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployeeData(){
		return employeeRepository.findAll();
	}
	
	public void addEmployeeData(Employee empData) {
		employeeRepository.save(empData);
	}
	
	public void updateEmployeeData(Employee empData) {
		Employee newEmployeeData = employeeRepository.findById(empData.getEmployee_Id()).orElse(null);
		newEmployeeData.setEmployeeName(empData.getEmployeeName());
		newEmployeeData.setEmpDept(empData.getEmpDept());
		employeeRepository.save(newEmployeeData);
	}
	
	public List<Employee_Information> getAllEmployeeInformation(){
		return employee_InformationRepository.findAll();
	}
	
	public void addEmployeeInformation(Employee_Information empInfo) {
		employee_InformationRepository.save(empInfo);
	}
	
	public void updateEmployeeInformation(Employee_Information empInfo) {
		Employee_Information newEmployeeInfo= employee_InformationRepository.findById(empInfo.getEmployee_ID()).orElse(null);
		newEmployeeInfo.setAge(empInfo.getAge());
		newEmployeeInfo.setEmail(empInfo.getEmail());
		newEmployeeInfo.setPhoneNumber(empInfo.getPhoneNumber());
		newEmployeeInfo.setSalary(empInfo.getSalary());
		employee_InformationRepository.save(newEmployeeInfo);
	}

}
