package com.testng.basics.class4;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

    public void onTestStart(ITestResult result){
        System.out.println("Starting test with the name " + result.getName());
    }
    public void onTestSuccess(ITestResult result){
        System.out.println("Test passed, take screenshots");
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("Finishing test case with the name "+result.getName());
    }
    public void onTestFailure(ITestResult result){
        System.out.println("Test failed, will report it");
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){

    }
    public void onStart(ITestContext context){

    }
    public void onFinish(ITestContext context){

    }
}
