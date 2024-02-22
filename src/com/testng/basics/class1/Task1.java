package com.testng.basics.class1;

import org.testng.annotations.*;

public class Task1 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class condition");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class condition");
    }

//    @BeforeSuite
//    public void beforeSuite(){
//        System.out.println("I'm before suite");
//    }
//    @AfterSuite
//    public void afterSuite(){
//        System.out.println("I'm after suite");
//    }

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
