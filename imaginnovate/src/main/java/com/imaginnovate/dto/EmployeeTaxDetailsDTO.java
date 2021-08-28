package com.imaginnovate.dto;

public class EmployeeTaxDetailsDTO {
	
	private String employeeCode;
	
	private String employeeFirstName;
	
	private String employeeLastName;
	
	private String employeeYearlySalary;
	
	private Double employeeTaxAmount;
	
	private Double employeeCessAmount;

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeeYearlySalary() {
		return employeeYearlySalary;
	}

	public void setEmployeeYearlySalary(String employeeYearlySalary) {
		this.employeeYearlySalary = employeeYearlySalary;
	}

	public Double getEmployeeTaxAmount() {
		return employeeTaxAmount;
	}

	public void setEmployeeTaxAmount(Double employeeTaxAmount) {
		this.employeeTaxAmount = employeeTaxAmount;
	}

	public Double getEmployeeCessAmount() {
		return employeeCessAmount;
	}

	public void setEmployeeCessAmount(Double employeeCessAmount) {
		this.employeeCessAmount = employeeCessAmount;
	}

}
