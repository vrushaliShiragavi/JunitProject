package junit;

import org.junit.jupiter.api.Test;

import code.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest {
	@DisplayName("Two positive num test where result is matching")
	@Test
	public void test1() {

		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9, result);
	}
	@DisplayName("one negative one positive num test")
	@Test
	public void test2() {

		int result = Calculator.add(-4, 5);
		Assertions.assertEquals(1, result);
	}
	@DisplayName("one negative one positive num test where result is not matching")
	@Test
	public void test3() {

		int result = Calculator.add(4, 5);
		Assertions.assertNotEquals(10, result);
	}

}
