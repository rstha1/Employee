package com.employeeDb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeeDb.domain.Employee_Information;

public interface Employee_InformationRepository extends JpaRepository<Employee_Information, Integer> {

}
