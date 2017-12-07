package com.calculator.testcases.advanced;

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.calculator.superclasses.AdvancedOperations;

public class AdvancedSquaredTests {
	private static final Logger LOG = Logger.getLogger(AdvancedOperations.class.getName());
	AdvancedOperations calc = new AdvancedOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#.##");

	@Test
	public void testSqrdPostiveNumbers() {
		double testValue = 0;
		double result = 0;
		
		for (int i = 0; i<=50; i++) {
			testValue = random.nextDouble()*100;
			result = testValue * testValue;
			calc.Squared(testValue);
			
			LOG.info("Testing method with value: " + df.format(testValue));
			assertEquals(calc.getResult(), result, 0);
		}
	}
	
	@Test
	public void testSqrdNegativeNumbers() {
		double testValue = 0;
		double result = 0;
		
		for (int i = 0; i<=50; i++) {
			testValue = random.nextDouble()*100;
			testValue = 0 - testValue;
			result = testValue * testValue;
			calc.Squared(testValue);
			
			LOG.info("Testing method with value: " + df.format(testValue));
			assertEquals(calc.getResult(), result, 0);
		}
	}
	
	@Test
	public void testSqrdZeros() {
		double testValue = 0;
		double result = 0;
		
		for (int i = 0; i<=50; i++) {
			result = testValue * testValue;
			calc.Squared(testValue);
			
			LOG.info("Testing method with value: " + df.format(testValue));
			assertEquals(calc.getResult(), result, 0);
		}
	}

}
