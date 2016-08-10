package lab5;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

	public void testParser(){
		Calculator calculator = new Calculator(5d);
		
		Double result = calculator.parser("12 + 5");
		assertEquals(17d, result);
		
		result = calculator.parser("12 - 5");
		assertEquals(7d, result);
		
		result = calculator.parser("12 * 5");
		assertEquals(60d, result);
		
		result = calculator.parser("12 / 5");
		assertEquals(2.4d, result);
		
		result = calculator.parser("12 [ 5");
		assertEquals(null, result);
		
		result = calculator.parser("12 * 5 [");
		assertEquals(60d, result);
	}
	
	public void testAdd(){
		Calculator calculator = new Calculator(5);
		
		double result = calculator.add(10d);
		assertEquals(15d, result);
		
		result = calculator.add(-3);
		assertEquals(2d, result);
		
		result = calculator.add(2.5d);
		assertEquals(7.5d, result);
		
		calculator.setBaseNumber(-3d);
		
		result = calculator.add(-2d);
		assertEquals(-5d, result);
	}
	
	public void testMultiplication(){
		Calculator calculator = new Calculator(5);
		double result = calculator.multiply(3d);
		assertEquals(15d, result);
		
		calculator.setBaseNumber(-2.5d);
		result = calculator.multiply(-2);
		assertEquals(5d, result);
	}
}
