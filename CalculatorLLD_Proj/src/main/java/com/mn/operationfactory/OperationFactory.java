package com.mn.operationfactory;

import com.mn.exceptions.InvalidOperatorException;
import com.mn.model.Calculator;
import com.mn.operations.Addition;
import com.mn.operations.Division;
import com.mn.operations.Multiplication;
import com.mn.operations.Subtraction;
import com.mn.utils.CalculatorConstants;

public class OperationFactory {

	public static Object doOperation(Calculator cal) {

		String operator = cal.getOperation();
		switch (operator) {
		case CalculatorConstants.ADDITION:
			 return new Addition().apply(cal);
		case CalculatorConstants.SUBTRACTION:
			return new Subtraction().apply(cal);
		case CalculatorConstants.MULTIPLICATION:
			return new Multiplication().apply(cal);
		case CalculatorConstants.DIVISION:
			return new Division().apply(cal);
		default:
			throw new InvalidOperatorException("Invalid operator: " + operator);
		}

	}

}
