

import static org.junit.Assert.*;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

import com.calculator.superclasses.AdvancedOperations;

public class AdvancedSquareRootTests {
	private static final Logger LOG = Logger.getLogger(AdvancedOperations.class.getName());
	AdvancedOperations calc = new AdvancedOperations();
	Random random = new Random();
	DecimalFormat df = new DecimalFormat("#.##");

	@Test
	public void testSqrtPostiveNumbers() {
		double testValue = 0;
		double result = 0;
		
		for (int i = 0; i<=50; i++) {
			testValue = random.nextDouble()*100;
			result = Math.sqrt(testValue);
			calc.SquareRoot(testValue);
			
			LOG.info("Testing method with value: " + df.format(testValue));
			assertEquals(calc.getResult(), result, 0);
		}
	}
	
	@Test
	public void testSqrtNegativeNumbers() {
		double testValue = 0;
		double result = 0;
		
		for (int i = 0; i<=50; i++) {
			testValue = random.nextDouble()*100;
			testValue = 0 - testValue;
			result = Math.sqrt(testValue);
			calc.SquareRoot(testValue);
			
			LOG.info("Testing method with value: " + df.format(testValue));
			assertEquals(calc.getResult(), result, 0);
		}
	}
	
	@Test
	public void testSqrtZeros() {
		double testValue = 0;
		double result = 0;
		
		for (int i = 0; i<=50; i++) {
			result = Math.sqrt(testValue);
			calc.SquareRoot(testValue);
			
			LOG.info("Testing method with value: " + df.format(testValue));
			assertEquals(calc.getResult(), result, 0);
		}
	}

}
