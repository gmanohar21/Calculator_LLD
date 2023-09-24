package com.mn.operations;

import com.mn.exceptions.DivisionByZeroException;
import com.mn.model.Calculator;

public class Division implements IOperations {
	 
	@Override
	public Calculator apply(Calculator calculator)  {
		  if (calculator.getSecondNumber() != 0) {
			  Double sol =  calculator.getFirstNumber() / calculator.getSecondNumber();
			  calculator.setSolution(sol);
			  return calculator;
	        } else {
	        	 throw new DivisionByZeroException("Division by zero is not allowed.");
	        }
		
	}
}
