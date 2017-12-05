/**
 * BasicOperations
 * 
 * @author Hussein Kadhum.
 * @version 1.0 alpha
 **/

package com.calculator.superclasses;

public class BasicOperations {
	private double firstValue = 0;
	private double secondValue = 0;
	private double result = 0;
	
	
	/**
	 * Getter for firstValue
	 * @return firstValue
	 */
	
	public double getFirstValue() {
		return firstValue;
	}
	
	
	/**
	 * Setter for firstValue
	 * @param firstValue
	 */
	
	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}
	
	
	/**
	 * Getter for secondValue
	 * @return secondValue
	 */
	public double getSecondValue() {
		return secondValue;
	}
	
	
	/**
	 * Setter for secondValue
	 * @param secondValue
	 */
	
	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}
	
	
	/**
	 * Getter for result
	 * @return result
	 */
	public double getResult() {
		return result;
	}
	

	/**
	 * Setter for result
	 * @param result
	 */
	public void setResult(double result) {
		this.result = result;
	}
	
	
	
	/**
	 * Method to add two values
	 * @param firstValue
	 * @param secondValue
	 */
	public void Addition (double firstValue, double secondValue) {
		setResult(firstValue + secondValue);
	}
	
	
	/**
	 * Method to subtract two values
	 * @param firstValue
	 * @param secondValue
	 */
	public void Subtraction (double firstValue, double secondValue) {
		setResult(firstValue - secondValue);
	}
	
	
	/**
	 * Method to multiply two values
	 * @param firstValue
	 * @param secondValue
	 */
	public void Multiplication (double firstValue, double secondValue) {
		setResult(firstValue * secondValue);
	}
	
	
	/**
	 * Method to divide two values
	 * @param firstValue
	 * @param secondValue
	 */
	public void Division (double firstValue, double secondValue) {
		setResult(firstValue / secondValue);
	}

}
