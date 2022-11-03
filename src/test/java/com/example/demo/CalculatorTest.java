package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

        @Disabled
        @Test
        public void add(){
            Calculator calculator = new Calculator();
            int result = Calculator.add(1,2);

            assertNotNull(result);
            assertEquals(3, result);
            assertTrue(result>1);
        }

        @DisplayName("測試除法問題 ")
        @Test
        public void divide(){
            Calculator calculator = new Calculator();

            assertThrows(ArithmeticException.class, () -> {
                calculator.divide(1, 0);
            });
        }
}