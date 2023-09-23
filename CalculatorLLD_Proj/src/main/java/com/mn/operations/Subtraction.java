package com.mn.operations;

import com.mn.model.Calculator;
import com.mn.service.ICalculatorService;

public class Subtraction implements ICalculatorService {

	@Override
	public Double calculatorOperation(Calculator calculator) {
		return calculator.getFirstNumber() - calculator.getSecondNumber();
	}
}
