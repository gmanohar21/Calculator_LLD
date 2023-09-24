package com.mn.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mn.model.Calculator;
import com.mn.serviceImpl.CalculatorServiceImpl;

@RestController
public class CalculatorController {

	@Autowired
	CalculatorServiceImpl calculatorService;

	@PostMapping("/cal")
	public Object calculatorOperattion(@RequestBody HashMap<String, Object> objRequest, Model model) {
		Calculator al = new Calculator();
		al.setFirstNumber(Double.valueOf(objRequest.get("firstNumber").toString()));
		al.setSecondNumber(Double.valueOf(objRequest.get("secondNumber").toString()));
		al.setOperation(objRequest.get("operation").toString());

		Object calSol = calculatorService.calculatorOperation(al);
		double doubleValue = Double.valueOf(calSol.toString());
		Object val=null;
		if (doubleValue % 1 == 0) {
			val=doubleValue;
		    model.addAttribute("value", doubleValue);
		} else {
		    System.out.println(String.format("%.1f", doubleValue));
		    val=doubleValue;
		    model.addAttribute("value", doubleValue);
		}
		return val;
	}

}
