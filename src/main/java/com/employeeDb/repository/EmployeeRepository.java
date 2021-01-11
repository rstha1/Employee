package com.employeeDb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeDb.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
