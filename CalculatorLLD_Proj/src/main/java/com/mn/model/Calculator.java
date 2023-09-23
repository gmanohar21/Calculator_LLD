package com.mn.model;

public class Calculator {

	private Double FirstNumber;
	private Double SecondNumber;
	private String Operation;

	public Calculator(Double firstNumber, Double secondNumber, String operation) {
		FirstNumber = firstNumber;
		SecondNumber = secondNumber;
		Operation = operation;
	}

	public Double getFirstNumber() {
		return FirstNumber;
	}

	public void setFirstNumber(Double firstNumber) {
		FirstNumber = firstNumber;
	}

	public Double getSecondNumber() {
		return SecondNumber;
	}

	public void setSecondNumber(Double secondNumber) {
		SecondNumber = secondNumber;
	}

	public String getOperation() {
		return Operation;
	}

	public void setOperation(String operation) {
		Operation = operation;
	}

	@Override
	public String toString() {
		return "Calculator [FirstNumber=" + FirstNumber + ", SecondNumber=" + SecondNumber + ", Operation=" + Operation
				+ "]";
	}

}
