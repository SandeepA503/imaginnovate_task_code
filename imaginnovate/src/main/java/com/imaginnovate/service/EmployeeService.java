package com.imaginnovate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.dao.EmployeeDAO;
import com.imaginnovate.dto.EmployeeTaxDetailsDTO;
import com.imaginnovate.enitiy.Employee;
import com.imaginnovate.responses.Response;
import com.imaginnovate.responses.ResponseTaxDetails;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	public Response saveEmployeeDetails(Employee employee) {
		Response response = new Response();
		try {
			Employee empl = employeeDAO.saveEmployeeDetails(employee);
			response.setStatus(true);
			response.setStatusMsg("Successfully Saved Employee Details");
		} catch (Exception e) {
			// TODO: handle exception
			response.setStatus(false);
			response.setStatusMsg("Error Occur. Because " + e.getLocalizedMessage());
		} 
		return response;
	}
	
	public ResponseTaxDetails getEmployeeTaxDeductionDetails(String employeeId) {
		ResponseTaxDetails responseTaxDetails = new ResponseTaxDetails();
		try {
			EmployeeTaxDetailsDTO emplTaxDetails = employeeDAO.getEmployeeTaxDeductionDetails(employeeId);
			responseTaxDetails.setStatus(true);
			responseTaxDetails.setStatusMsg("Successfully got Employee Tax details");
			responseTaxDetails.setEmployeeTaxDetailsDTO(emplTaxDetails);
		} catch (Exception e) {
			// TODO: handle exception
			responseTaxDetails.setStatus(false);
			responseTaxDetails.setStatusMsg("Error Occur. Because " + e.getLocalizedMessage());
		} 
		return responseTaxDetails;
	}

}
