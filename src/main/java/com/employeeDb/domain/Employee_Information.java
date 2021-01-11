package com.employeeDb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity
@Table(name= "employee_information")
public class Employee_Information {
	
	@NonNull //ID
	@Id
	@Column(name = "employee_id")
	private int employee_ID; 
	@Column
	private long salary;
	@Column
	private int age;
	@Column (name = "phone_number")
	private long phoneNumber;
	@Column
	private String email;
	
	
	public Employee_Information(){
		
	}


	public Employee_Information(int employee_ID, long salary, int age, long phoneNumber, String email) {
		super();
		this.employee_ID = employee_ID;
		this.salary = salary;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}


	public int getEmployee_ID() {
		return employee_ID;
	}


	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
