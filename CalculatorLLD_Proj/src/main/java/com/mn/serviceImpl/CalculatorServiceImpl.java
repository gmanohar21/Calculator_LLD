package com.mn.serviceImpl;

import org.springframework.stereotype.Service;

import com.mn.model.Calculator;
import com.mn.operationfactory.OperationFactory;
import com.mn.service.ICalculatorService;
@Service
public class CalculatorServiceImpl implements ICalculatorService {

	@Override 
	public Object calculatorOperation(Calculator calculator) {
		OperationFactory.doOperation(calculator);
		Object sol=calculator.getSolution();
		return sol;
	}

}
