package com.sap.webCalculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sap.calculator.Calculator;
import com.sap.calculator.exceptions.InvalidExpressionException;
import com.sap.webCalculator.objects.Expression;

@Controller
public class MainController {

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String request(Model m) {
		m.addAttribute("expression", new Expression());
		return "question.html";
	}
	
	@RequestMapping(value = {"/ans"}, method = RequestMethod.POST)
	public String response(Model m, @ModelAttribute Expression expr) throws InvalidExpressionException {
		Calculator calc = new Calculator();
		Double answer = calc.calculate(expr.getExpr());
		m.addAttribute("expression", answer);
		return "answer.html";
	}
}
