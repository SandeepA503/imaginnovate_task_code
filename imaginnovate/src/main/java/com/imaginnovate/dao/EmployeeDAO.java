package com.imaginnovate.dao;

import com.imaginnovate.dto.EmployeeTaxDetailsDTO;
import com.imaginnovate.enitiy.Employee;

public interface EmployeeDAO {
	
	public Employee saveEmployeeDetails(Employee employee);
	
	public EmployeeTaxDetailsDTO getEmployeeTaxDeductionDetails(String employeeId);
}
