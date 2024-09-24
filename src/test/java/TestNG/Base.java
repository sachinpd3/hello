package TestNG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

/**
 * this is for sachin branch
 */
public class Base  {
   public static WebDriver driver;
   public static  ExtentReports report;
 public void ConfigReport(){
     ExtentSparkReporter reporter=new ExtentSparkReporter("Reports/report.html");
     reporter.config().setReportName("WebAutomatiom");
     reporter.config().setDocumentTitle("Resulte Automation");
     report=new ExtentReports();
     report.attachReporter(reporter);
     report.setSystemInfo("Tester","Sachin prasad");

 }

 public  void Initialize()  {
     ConfigReport();
    // report.createTest("First Test");
     Properties p = new Properties();
     FileInputStream fis = null;
     try {
         fis = new FileInputStream("src/main/resources/Configuration.properties");
     } catch (FileNotFoundException e) {
         System.out.println("file not found");
     }
     try {
         p.load(fis);
     } catch (IOException e) {
         System.out.println("file not found");
     }
     String appurl = System.getProperty("url")!=null?System.getProperty("url"):p.getProperty("url");
             //p.getProperty("url");
     System.out.println("------"+appurl+"-------");
     System.setProperty("webdriver.chrome.driver","C:\\Users\\sachi\\Desktop\\chromedriver\\chromedriver-win64\\chromedriver.exe");
     ChromeOptions chromeOptions = new ChromeOptions();
     chromeOptions.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(chromeOptions);
     driver.manage().window().maximize();
     driver.get(appurl);
 }

    public void  Screenshot(String methodname) {
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("test-output/"+methodname+".png"));
        } catch (IOException e) {
            System.out.println("screensot not captured");
        }

    }
    public List<HashMap<String, String>> GetJsondata(String filepath) throws IOException {
     String content=FileUtils.readFileToString(new File(filepath));
     ObjectMapper obj = new ObjectMapper();
     List<HashMap<String,String >> data=   obj.readValue(content, new TypeReference<List<HashMap<String,String>>>() {
        });
     return data;
    }


}
