package com.fdmgroup.RomanNumerals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class RomanNumbersTest {
	private RomanNumbers converter;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPassingIAndGet1() {
		//Arrange
		converter = new RomanNumbers();
		int expected = 1;
		//Act
		int result = converter.toArabic("I");
		//Assert
		assertEquals(expected, result);
	}
	
	@Test
	void testPassingIIAndGet2() {
		//Arrange
		converter = new RomanNumbers();
		int expected = 2;
		//Act
		int result = converter.toArabic("II");
		//Assert
		assertEquals(expected, result);
	}
	
	@Test
	void testPassingIIIAndGet3() {
		//Arrange
		converter = new RomanNumbers();
		int expected = 3;
		//Act
		int result = converter.toArabic("III");
		//Assert
		assertEquals(expected, result);
	}
	
	@Test
	void testPassingMMCMLIXAndGet2959() {
		//Arrange
		converter = new RomanNumbers();
		int expected = 2959;
		//Act
		int result = converter.toArabic("MMCMLIX");
		//Assert
		assertEquals(expected, result);
	}

	@Test
	void testPassingMMMCMXCIXAndGet3999() {
		//Arrange
		converter = new RomanNumbers();
		int expected = 3999;
		//Act
		int result = converter.toArabic("MMMCMXCIX");
		//Assert
		assertEquals(expected, result);
	}
	
	@Test
	void testPassingMZMXAndGetNegative1() {
		//Arrange
		converter = new RomanNumbers();
		int expected = -1;
		//Act
		int result = converter.toArabic("MZM");
		//Assert
		assertEquals(expected, result);
	}
}
