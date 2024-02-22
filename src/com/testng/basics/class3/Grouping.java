package com.testng.basics.class3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Grouping {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I'm before");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I'm after");
    }

    @Test(groups = "smoke")
    public void firstMethod(){
        System.out.println("I'm 1st method");
    }
    @Test(groups = "testone")
    public void secondMethod(){
        System.out.println("I'm 2nd method");
    }
    @Test(groups = "smoke")
    public void thirdMethod(){
        System.out.println("I'm 3rd method");
    }
    @Test(groups = "smoke")
    public void fourthMethod(){
        System.out.println("I'm 4th method");
    }
}
