package com.mn.service;

import com.mn.model.Calculator;

public interface ICalculatorService {

	// here i am using generics for either int or double val
	public Double calculatorOperation(Calculator calculator);
}
