package com.calculator.testcases;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.calculator.superclasses.BasicOperations;

public class BasicAdditionTests {
	private static final Logger LOG = Logger.getLogger(BasicOperations.class.getName());
	BasicOperations calc = new BasicOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#.##");
	

	@Test
	public void testAddPositiveNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i<=50; i++) {
			firstNumber = random.nextDouble()*100;
			secondNumber = random.nextDouble()*100;
			result = firstNumber + secondNumber;
			calc.Addition(firstNumber, secondNumber);
			
			LOG.info("Testing method with values: " + df.format(firstNumber) + " and " + df.format(secondNumber));
			assertEquals(calc.getResult(), result , 0);
		}
	}
	
	@Test
	public void testAddNegativeNumbers() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i<=50; i++) {
			firstNumber = random.nextDouble()*100;
			secondNumber = random.nextDouble()*100;
			secondNumber = 0 - secondNumber;
			result = firstNumber + secondNumber;
			calc.Addition(firstNumber, secondNumber);
			
			LOG.info("Testing method with values: " + df.format(firstNumber) + " and " + df.format(secondNumber));
			assertEquals(calc.getResult(), result , 0);
		}
	}
	
	@Test
	public void testAddZeros() {
		double firstNumber = 0;
		double secondNumber = 0;
		double result = 0;
		
		for(int i = 0; i<=50; i++) {
			firstNumber = random.nextDouble()*100;
			
			result = firstNumber + secondNumber;
			calc.Addition(firstNumber, secondNumber);
			
			LOG.info("Testing method with values: " + df.format(firstNumber) + " and " + df.format(secondNumber));
			assertEquals(calc.getResult(), result , 0);
		}
	}

}
