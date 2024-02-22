package com.testng.basics.class1;

import org.testng.annotations.*;

public class PreAndPostCondition {

    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("I'm before method");
    }

    @AfterTest
    public void afterTestMethod(){
        System.out.println("I'm after method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method function which will execute before each and every test");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method function which will execute after each and every test");
    }

    @Test
    public void firstFunction(){
        System.out.println("I'm dddd test");
    }

    @Test
    public void secondFunction(){
        System.out.println("I am aaaa test");
    }

    @Test
    public void thirdFunction(){
        System.out.println("I am cccc test");
    }
}
