package Testexample;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComplsit implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
       Integer I1= (Integer) o1;
       Integer I2= (Integer) o2;
       return I2.compareTo(I1);
    }
}
public class SelenuimTest {
    public static void main(String[] args) throws InterruptedException, IOException {
List<WebElement> lprice;
System.setProperty("webdriver.chrome.driver","C:\\Users\\sachi\\Desktop\\chromedriver\\chromedriver-win64\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();
ChromeOptions chromeOptions = new ChromeOptions();
chromeOptions.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver(chromeOptions);
driver.manage().window().maximize();
driver.get("https://www.bstackdemo.com/");
lprice= driver.findElements(By.cssSelector("div.val b"));
System.out.println(lprice);
System.out.println("--Before Sorting--");
List<Integer> oList= new ArrayList<>();
for(WebElement price:lprice){
Integer i= Integer.valueOf(price.getText());
oList.add(i);
}
Collections.sort(oList,new MyComplsit());
System.out.println(oList);
List<WebElement> lt= driver.findElements(By.cssSelector("select option"));
for(WebElement wl : lt){
if(wl.getText().contains("Highest to lowest"))
{
wl.click();
}
}
Thread.sleep(5000);
List<WebElement>  lsprice= driver.findElements(By.cssSelector("div.val b"));
System.out.println("--After  Sorting--");
List<Integer> nList= new ArrayList<>();
for(WebElement nprice:lsprice){
Integer i= Integer.valueOf(nprice.getText());
nList.add(i);
}
System.out.println(nList);
if(nList.equals(oList)){
System.out.println("--List is Sorted--");
}
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\sachi\\Pictures\\Saved Pictures\\sachin.png"));
driver.quit();
    }

}
