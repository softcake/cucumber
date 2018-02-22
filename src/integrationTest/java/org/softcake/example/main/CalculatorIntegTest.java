package org.softcake.example.main;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.softcake.example.main.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author René Neubert
 */
class CalculatorIntegTest {


	@Test
	@DisplayName("My 1st JUnit 5 test! 😎")
	@Tag("integration")
	void myFirstTest(TestInfo testInfo) {

		com.google.common.base.Preconditions.checkNotNull(testInfo);
		Calculator calculator = new Calculator();
		assertEquals(2d, calculator.add(1d, 1d), "1 + 1 should equal 2");
		assertEquals("My 1st JUnit 5 test! 😎", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
	}

}