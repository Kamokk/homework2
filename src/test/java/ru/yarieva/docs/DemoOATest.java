package ru.yarieva.docs;

import org.junit.jupiter.api.*;

public class DemoOATest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all test \n");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before test \n");
    }

    @Test
    void  firstTest() {
        System.out.println("Test \n");
    }
    @AfterEach
    void afterEach() {
        System.out.println("After each \n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After all test \n");
    }


}
