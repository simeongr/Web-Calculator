package com.sap.webCalculator.objects;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@NoArgsConstructor
public class Expression {
	
//	@Getter @Setter
	private String expr;

	public String getExpr() {
		return expr;
	}

	public void setExpr(String expr) {
		this.expr = expr;
	}
	
	public Expression() {}

}
