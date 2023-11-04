package com.sunbeam;

import java.io.Serializable;

@SuppressWarnings("serial")
public class EmployeeException extends Exception implements Serializable{
	String errorMsg;
	double value;
	
	public EmployeeException(String errorMsg,double value) {
		this.errorMsg = errorMsg;
		this.value = value;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public double getValue() {
		return value;
	}
	
	public void displayError() {
		System.out.println("Invalid value = "+this.getValue());
		System.out.println(this.getErrorMsg());
	}
}
