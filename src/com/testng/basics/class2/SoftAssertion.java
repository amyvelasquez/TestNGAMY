package com.testng.basics.class2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

    @Test
    public void softAssertionValidation(){
        String expectedtext = "This is my testing world";
        String actualText = "THIS is my testing world";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualText, expectedtext);
        System.out.println("My code after first assertion");

        softAssert.assertTrue(false);
        System.out.println("My code after second assertion");

        softAssert.assertFalse(true);
        System.out.println("My code after third assertion");

        String expectedTextsecond = "This is my testing world";
        String actualTextsecond = "THIS is my testing world";

        softAssert.assertEquals(actualTextsecond, expectedTextsecond);

        softAssert.assertAll();
    }
}
