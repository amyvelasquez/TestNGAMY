package com.testng.basics.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task2 {

    WebDriver driver;

    @BeforeMethod
    public void openBrowserAndLaunchApp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        // launch the application
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void invalidLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement errorField = driver.findElement(By.id("spanMessage"));

        String receivingText = errorField.getText();
        String actualText = "Password cannot be empty";

        Assert.assertEquals(receivingText, actualText);
        System.out.println("Test passed");

        //can do if/else or assertion, such as above ^^

//        if (receivingText.equals(actualText)){
//            System.out.println("Test is passed and error is displayed");
//        }else{
//            System.out.println("Test failed ad error is not displayed");
//        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
