package com.imaginnovate.enitiy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name="id")
	@GeneratedValue(generator = "empid_gen")
	@SequenceGenerator(name = "empid_gen", sequenceName = "empid_gen_seq", initialValue = 1, allocationSize = 1)
	private Integer id;
	
	@Column(name = "emp_id", nullable = false)
	private String employeeId;

	@Column(name = "emp_f_name", nullable = false)
	private String employeeFirstName;

	@Column(name = "emp_l_name", nullable = false)
	private String employeeLastName;

	@Column(name = "emp_email", nullable = false)
	@Email
	private String employeeEmail;

	@Column(name = "emp_phone_num", columnDefinition = "TEXT", nullable = false)
	private String employeePhoneNumber;

	@Column(name = "emp_doj", nullable = false)
	private String employeeDOJ;

	@Column(name = "emp_salary_per_month", nullable = false)
	private Integer employeeSalaryPerMonth;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
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

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeePhoneNumber() {
		return employeePhoneNumber;
	}

	public void setEmployeePhoneNumber(String employeePhoneNumber) {
		this.employeePhoneNumber = employeePhoneNumber;
	}

	public String getEmployeeDOJ() {
		return employeeDOJ;
	}

	public void setEmployeeDOJ(String employeeDOJ) {
		this.employeeDOJ = employeeDOJ;
	}

	public Integer getEmployeeSalaryPerMonth() {
		return employeeSalaryPerMonth;
	}

	public void setEmployeeSalaryPerMonth(Integer employeeSalaryPerMonth) {
		this.employeeSalaryPerMonth = employeeSalaryPerMonth;
	}


}
