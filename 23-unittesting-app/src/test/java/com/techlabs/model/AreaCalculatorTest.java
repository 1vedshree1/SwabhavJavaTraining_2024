package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {
	
	AreaCalculator area;
	@BeforeEach
	public void init() {
		area = new AreaCalculator();
	}

	@Test
	void testAreaOfCircle() {
		assertEquals(78.5,area.areaOfCircle(5));
	}

	@Test
	void testAreaOfTriangle() {
		assertEquals(25,area.areaOfTriangle(10, 5));
	}

	@Test
	void testAreaOfRectangle() {
		assertEquals(15,area.areaOfRectangle(5, 3));
	}

}
