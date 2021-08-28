package com.imaginnovate.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imaginnovate.enitiy.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
	
	public Employee findByEmployeeId(String employeeId);

}
