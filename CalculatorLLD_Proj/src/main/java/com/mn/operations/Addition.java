package com.mn.operations;

import com.mn.model.Calculator;

public class Addition implements IOperations {

	@Override
	public Calculator apply(Calculator calculator) {
		Double sol = calculator.getFirstNumber() + calculator.getSecondNumber();
		calculator.setSolution(sol);
		return calculator;
	}
}
