package com.imaginnovate.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.imaginnovate.dao.EmployeeDAO;
import com.imaginnovate.dto.EmployeeTaxDetailsDTO;
import com.imaginnovate.enitiy.Employee;
import com.imaginnovate.repository.EmployeeRepository;

@Component
public class EmployeeDaoImpl implements EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployeeDetails(Employee employee) {
		Employee employeeData = employeeRepository.saveAndFlush(employee);
		return employeeData;
	}

	@Override
	public EmployeeTaxDetailsDTO getEmployeeTaxDeductionDetails(String employeeId) {
		
		EmployeeTaxDetailsDTO empTaxDto = new EmployeeTaxDetailsDTO();
		Employee employeeData = employeeRepository.findByEmployeeId(employeeId);
		
		String empDOJ = employeeData.getEmployeeDOJ();

		Double salPerDay = (double) (employeeData.getEmployeeSalaryPerMonth() / 30);
		Integer salPerYear = employeeData.getEmployeeSalaryPerMonth() * 12;
		Double empCessAmnt = 0d;
		Double empTaxPerYear = getTaxPerYearOfEmployee(salPerYear);

		if (salPerYear > 2500000) {
			empCessAmnt = (double) (salPerYear * 2 / 100);
		}

		empTaxDto.setEmployeeCode(employeeData.getEmployeeId());
		empTaxDto.setEmployeeFirstName(employeeData.getEmployeeFirstName());
		empTaxDto.setEmployeeLastName(employeeData.getEmployeeLastName());
		empTaxDto.setEmployeeYearlySalary(String.valueOf(salPerYear));
		empTaxDto.setEmployeeTaxAmount(empTaxPerYear);
		empTaxDto.setEmployeeCessAmount(empCessAmnt);
		return empTaxDto;
	}
	
	private Double getTaxPerYearOfEmployee(Integer salPerYear) {
		Double empTaxPerYear = 0d;
		if (salPerYear <= 250000) {
			empTaxPerYear = 0d;
		} else if (salPerYear > 250000 && salPerYear <= 500000) {
			empTaxPerYear = (double) (salPerYear * 5 / 100);
		} else if (salPerYear > 500000 && salPerYear <= 1000000) {
			empTaxPerYear = (double) (salPerYear * 10 / 100);
		} else if (salPerYear > 1000000) {
			empTaxPerYear = (double) (salPerYear * 20 / 100);
		}
		return empTaxPerYear;
	}

}
