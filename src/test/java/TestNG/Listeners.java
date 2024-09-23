package TestNG;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;


public class Listeners extends Base implements ITestListener {

    ExtentTest test;
    /**
     * Threadlocal class will make execution Thread safe,which is required for parallel execution
     */
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
    @Override
    public void onTestStart(ITestResult result) {

         test=  report.createTest(result.getMethod().getMethodName());
         extentTest.set(test);

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Screenshot(result.getName() );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        extentTest.get().log(Status.PASS,"Test Passed");
        extentTest.get().addScreenCaptureFromPath("C:\\Users\\sachi\\IdeaProjects\\TestFolder\\test-output\\"+result.getName()+".png",result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.get().fail(result.getThrowable());
       // Screenshot(result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        report.flush();
    }
}
