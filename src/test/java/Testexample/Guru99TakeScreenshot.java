package Testexample;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

public class Guru99TakeScreenshot {
@Test
    public void testGuru99TakeScreenShot() throws Exception{
        WebDriver driver ;
        System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/V4/");
        takeSnapShot(driver, "c://test.png") ;
    }
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
    TakesScreenshot scrShot =((TakesScreenshot)webdriver);
    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    File DestFile=new File(fileWithPath);
    FileUtils.copyFile(SrcFile, DestFile);
    }

}
