package com.testng.basics.class2;

import org.testng.annotations.Test;

public class DependsOnAttribute {

    @Test
    public void launchApplication(){
        System.out.println("This is login test");
    }

    @Test(dependsOnMethods = "launchApplication")// if launchApplication method doesn't pass, this test will not run
    public void enterCredentials(){
        System.out.println("This is the dependent method");
    }
}
