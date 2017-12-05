package com.calculator.superclasses;

public class AdvancedOperations {
	private double firstValue = 0;
	private double result = 0;
	
	
	
	public double getFirstValue() {
		return firstValue;
	}
	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
	
	
	public void Sine(double firstValue) {
		setResult(Math.sin(firstValue));
	}
	
	public void Cosine(double firstValue) {
		setResult(Math.cos(firstValue));
	}
	
	public void Tangent(double firstValue) {
		setResult(Math.tan(firstValue));
	}
	
	public void Logarithm(double firstValue) {
		setResult(Math.log10(firstValue));
	}
	
	public void SquareRoot(double firstValue) {
		setResult(Math.sqrt(firstValue));
	}
	
	public void Squared(double firstValue) {
		setResult(firstValue * firstValue);
	}
}
