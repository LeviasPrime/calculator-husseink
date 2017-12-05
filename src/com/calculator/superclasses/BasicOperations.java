package com.calculator.superclasses;

public class BasicOperations {
	private double firstValue = 0;
	private double secondValue = 0;
	private double result = 0;
	
	
	
	public double getFirstValue() {
		return firstValue;
	}
	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}
	public double getSecondValue() {
		return secondValue;
	}
	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
	
	public void Addition (double firstValue, double secondValue) {
		setResult(firstValue + secondValue);
	}
	
	public void Subtraction (double firstValue, double secondValue) {
		setResult(firstValue - secondValue);
	}
	
	public void Multiplication (double firstValue, double secondValue) {
		setResult(firstValue * secondValue);
	}
	
	public void Division (double firstValue, double secondValue) {
		setResult(firstValue / secondValue);
	}

}
