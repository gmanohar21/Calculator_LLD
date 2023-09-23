package com.mn.operations;

import com.mn.exceptions.DivisionByZeroException;
import com.mn.model.Calculator;
import com.mn.service.ICalculatorService;

public class Division implements ICalculatorService {
	 
	@Override
	public Double calculatorOperation(Calculator calculator)  {
		  if (calculator.getSecondNumber() != 0) {
			  return calculator.getFirstNumber() / calculator.getSecondNumber();
	        } else {
	        	 throw new DivisionByZeroException("Division by zero is not allowed.");
	        }
		
	}
}
