package com.calculator.superclasses;
/**
 * AdvancedOperations
 * 
 * @author Hussein Kadhum.
 * @version 1.0 alpha
 **/

public class AdvancedOperations {
	private double firstValue = 0;
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
	 * Method to solve sine of value in radians
	 * @param firstValue
	 */
	public void Sine(double firstValue) {
		setResult(Math.sin(firstValue));
	}
	
	
	/**
	 * Method to solve cosine of value in radians
	 * @param firstValue
	 */
	public void Cosine(double firstValue) {
		setResult(Math.cos(firstValue));
	}
	
	
	/**
	 * Method to solve tangent of value in radians
	 * @param firstValue
	 */
	public void Tangent(double firstValue) {
		setResult(Math.tan(firstValue));
	}
	
	
	/**
	 * Method to solve log base 10 of a value
	 * @param firstValue
	 */
	public void Logarithm(double firstValue) {
		setResult(Math.log10(firstValue));
	}
	
	
	/**
	 * Method to solve the square root of a value
	 * @param firstValue
	 */
	public void SquareRoot(double firstValue) {
		setResult(Math.sqrt(firstValue));
	}
	
	
	/**
	 * Method to solve 2 power of value
	 * @param firstValue
	 */
	public void Squared(double firstValue) {
		setResult(firstValue * firstValue);
	}
}
