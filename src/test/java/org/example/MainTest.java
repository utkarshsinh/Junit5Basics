package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main main;

    @BeforeAll
    static void setup(){
        System.out.println("Executing before all methods");
    }

    @AfterAll
    static void cleanup(){
        System.out.println("After all the methods executed");
    }



    @BeforeEach
    void beforeEachMethod(){
        main = new Main();
        System.out.println("Executing before each method");
    }
    //    test<System Under Test> _ Condition or State Change>_<Expected Result>
    @Test
    void testIntegerDivision_WhenFourisDividedbyTwo_ShouldReturnTwo() {
        //        arrange

        //        act
        int result = main.integerDivision(6, 2);
        //        assert
        assertEquals(3, result, "6/2 did not produce correct result");
    }
//    @Disabled("Still working on it")
    @DisplayName("Checking")
    @Test
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
    @ParameterizedTest
    @ValueSource(strings = {"John", "Utkarsh", "Harsh", ""})
    void valueSourceDemo(String name){
        System.out.println(name);
        assertNotNull(name);
    }

    @ParameterizedTest
//    @MethodSource("inputParameters")
//    @CsvSource({
//            "33, 32, 1",
//            "24, 23, 1",
//            "13, 12, 1"
//    })
    @CsvFileSource(resources = "/integerSubtraction.csv")
    void integerSubtraction(int minuend, int subtrahend, int expectedResult) {
        int result = main.integerSubtraction(minuend, subtrahend);
        assertEquals(expectedResult, result, ()->"Wrong Subtracted Result");
    }

//    public static Stream<Arguments> inputParameters() {
//        return Stream.of(Arguments.of(33, 32, 1),
//                Arguments.of(54, 1, 53),
//                Arguments.of(24, 1, 23));
//    }
}