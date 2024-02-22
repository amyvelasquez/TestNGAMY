package com.testng.basics.class2;

import org.testng.annotations.*;

public class BeforeAndAfterTestAndSuite {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("I'm before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("I'm after suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("method before each test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("method after each test");
    }

    @Test
    public void firstMethod(){
        System.out.println("1st test method");
    }
    @Test
    public void secondMethod(){
        System.out.println("2nd test method");
    }
}
