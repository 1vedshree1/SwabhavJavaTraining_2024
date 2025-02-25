package com.techlabs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {

    private Operations operation;

    @BeforeEach
    void init() {
        operation = new Operations();
    }
    
    @AfterEach
    void status() {
        System.out.println("Test finished");
    }
    
    @Test
    void testAddition() {
        assertEquals(30, operation.addition(10, 20), "Addition result should be 30");
    }
    
    @Test
    void testSubtraction() {
        assertEquals(10, operation.substraction(20, 10), "Subtraction result should be 10");
    }
    @Test
    void testDivision() {
        assertEquals(2, operation.division(10, 5), "Division result should be 2");
        assertThrows(ArithmeticException.class, () -> operation.division(10, 0), "Division by zero should throw ArithmeticException");
    }
    @Test
    void testsquareOfNumbers() {
    	int squares[]= {25,36,49};
    	int numbers[]= {5,6,7};
    	assertArrayEquals(squares,operation.squareOfElements(numbers));
  	
    }
    @Test
    void testIsEven() {
    	assertTrue(operation.isEven(6));
    	assertFalse(operation.isEven(7));
    }
}
