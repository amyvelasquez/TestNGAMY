package com.testng.basics.class2;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 2, groups = "smoke")
    public void logoutMethod(){
        System.out.println("This execution should come later");
    }

    @Test(priority = 1, groups = "smoke")
    public void loginMethod(){
        System.out.println("This execution should come first");
    }

    @Test(priority = 3)
    public void enterCredentialsMethod(){
        System.out.println("This execution should come in the end");
    }

}
