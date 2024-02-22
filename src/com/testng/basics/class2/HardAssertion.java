package com.testng.basics.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAssertion {

    //Hard assertions will not allow rest of code to execute if assertion doesn't pass

    WebDriver driver;

    @BeforeMethod
    public void launchApplication() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void validLogin(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement welcomeMessage = driver.findElement(By.xpath("//*[text()='Welcome Admin']"));

        Assert.assertTrue(welcomeMessage.isDisplayed());

        String actualText = welcomeMessage.getText();
        String expectedText = "Welcome Admin";

        Assert.assertEquals(actualText, expectedText);

        System.out.println("My test case passed and working fine");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
