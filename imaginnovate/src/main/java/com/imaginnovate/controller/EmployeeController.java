package com.imaginnovate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.enitiy.Employee;
import com.imaginnovate.responses.Response;
import com.imaginnovate.responses.ResponseTaxDetails;
import com.imaginnovate.service.EmployeeService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	/**
	 * Create an app in Java and develop the following REST APIs
		1. API endpoint to store employee details(Validate the data and throw the errors on invalid data)
		Fields(All fields are mandatory):
		Code
		FirstName
		LastName
		Email
		PhoneNumber(May have multiple phone numbers)
		DOJ
		Salary(per month)
	 */
	
	@RequestMapping(value = "/saveEmployeeDetails", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public Response saveEmployeeDetails(@RequestBody Employee employee) {
		return employeeService.saveEmployeeDetails(employee);
	}
	
	/**
	 * API endpoint to return employees' tax deduction for the current financial year(April to March). 
	 * API should return employee code, first name, last name, yearly salary, tax amount, cess amount.
	 * Tax slabs on yearly salary:
	 * No Tax for <=250000
	 * 5% Tax for >250000 and <=500000
	 * 10% Tax for >500000 and <=1000000
	 * 20% Tax for >1000000
	 * (Ex: if salary is 750000, for first 250000 no tax, for 250001 to 500000 tax is 12500, for 500001 to 750000 tax is 25000 and total tax is 37500)
	 */
	
	@RequestMapping(value = "/getEmployeeTaxDeductionDetails/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseTaxDetails getEmployeeTaxDeductionDetails(@PathVariable("employeeId") String employeeId) {
		return employeeService.getEmployeeTaxDeductionDetails(employeeId);
	}
}
