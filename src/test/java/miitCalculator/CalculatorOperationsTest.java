package miitCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import calculator.CalculatorOperations;

public class CalculatorOperationsTest {

	@Test
	public void testAddOperation() {
		CalculatorOperations op = new CalculatorOperations();
		assertEquals(7,op.addOperation(5, 2));
	}
	
	@Test
	public void testsubOperation1() {
		CalculatorOperations op = new CalculatorOperations();
		assertEquals(5,op.subOperation(10, 5));
	}
	
	@Test
	public void testmultiOperation() {
		CalculatorOperations op = new CalculatorOperations();
		assertEquals(50,op.multiOperation(10, 5));
	}
	
	@Test
	public void testdivOperation() {
		CalculatorOperations op = new CalculatorOperations();
		assertEquals((double)2,op.divOperation(10, 5),0.01);
	}
}
