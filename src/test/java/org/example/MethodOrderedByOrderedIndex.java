package org.example;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderedIndex {
    StringBuilder completed = new StringBuilder("");
    @Order(4)
    @Test
    void testC(){
        System.out.println("Running test C");
        completed.append("4");
    }
    @Order(3)
    @Test
    void testD(){
        System.out.println("Running test D");
        completed.append("3");
    }
    @Order(1)
    @Test
    void testA(){
        System.out.println("Running test A");
        completed.append("1");
    }

    @Order(2)
    @Test
    void testB(){
        System.out.println("Running test B");
        completed.append("2");
    }


}
