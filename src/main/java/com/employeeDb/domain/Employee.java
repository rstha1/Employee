package com.employeeDb.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

@Entity

@Table(name = "employee")
public class Employee {

	@Id
	
	@Column (name = "employee_id")
	private int employee_ID;
	@Column (name = "emp_dept")
	private String employeeName;
	@Column (name = "employee_name")
	private String empDept;
	
	public Employee() {
		
	}

	public Employee(int employee_Id, String employeeName, String empDept) {
		super();
		this.employee_ID = employee_Id;
		this.employeeName = employeeName;
		this.empDept = empDept;
	}

	public int getEmployee_Id() {
		return employee_ID;
	}

	public void setEmployee_Id(int employee_Id) {
		this.employee_ID = employee_Id;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
}
