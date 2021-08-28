package com.imaginnovate.responses;

import com.imaginnovate.dto.EmployeeTaxDetailsDTO;

public class ResponseTaxDetails {

	private boolean status = false;
	
	private String statusMsg = "";
	
	private EmployeeTaxDetailsDTO employeeTaxDetailsDTO;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getStatusMsg() {
		return statusMsg;
	}

	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}

	public EmployeeTaxDetailsDTO getEmployeeTaxDetailsDTO() {
		return employeeTaxDetailsDTO;
	}

	public void setEmployeeTaxDetailsDTO(EmployeeTaxDetailsDTO employeeTaxDetailsDTO) {
		this.employeeTaxDetailsDTO = employeeTaxDetailsDTO;
	}
	
	
}
