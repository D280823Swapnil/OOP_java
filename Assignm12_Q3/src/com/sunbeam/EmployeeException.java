package com.sunbeam;

import java.io.Serializable;

public class EmployeeException extends Exception implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3064174329865020148L;
	String errorMsg;
	double value;

	public EmployeeException(String errorMsg, double value) {
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
		System.out.println("Invalid value = " + this.getValue());
		System.out.println(this.getErrorMsg());
	}
}
