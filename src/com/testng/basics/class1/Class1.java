package com.testng.basics.class1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

    @Test(groups = "smoke")
    public void firstFunction(){
        System.out.println("I'm dddd test");
    }

    @Test(groups = "smoke")
    public void secondFunction(){
        System.out.println("I am cccc test");
    }

    @Test(groups = "regression")
    public void thirdFunction(){
        System.out.println("I'm aaaa test");
    }

    @Test(groups = "smoke")
    public void fourthFunction(){
        System.out.println("I'm bbbbb test");
    }
}
