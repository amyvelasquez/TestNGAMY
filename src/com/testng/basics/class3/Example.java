package com.testng.basics.class3;

import org.testng.annotations.Test;

public class Example {

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
