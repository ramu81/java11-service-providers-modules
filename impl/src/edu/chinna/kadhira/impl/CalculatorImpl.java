package edu.chinna.kadhira.impl;

import edu.chinna.kadhira.api.Calculator;
import static java.lang.System.out;
import static java.lang.Integer.sum;

public class CalculatorImpl implements Calculator {
	public CalculatorImpl(){
		out.println(" creating Calculator "+this.hashCode());
	}
	public static CalculatorImpl provider(){
		out.println(" creating Calculator from provider ");
		return new CalculatorImpl();
	}
	public int add(int a, int b) {
		return sum(a,b);
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
}