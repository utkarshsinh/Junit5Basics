package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DemoRepeatedTests {


    Main main;

    @BeforeEach
    void beforeEachMethod(){
        main = new Main();
        System.out.println("Executing before each method");
    }

    @DisplayName("Checking")
    @RepeatedTest(3)
    void divisionByZero() {
//        Arrange
        int dividend = 4;
        int divisor = 0;
        String expectedMessage = "/ by zero";

//        Act and Assert
        ArithmeticException actualException = assertThrows(ArithmeticException.class, () -> main.integerDivision(dividend, divisor), "" +
                "Division by Zero throws Arithmetic expresion");

        assertEquals(expectedMessage, actualException.getMessage(), "Unexpected exception message");
    }
}
