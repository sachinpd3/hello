package TestNG;


import DemoPage.DemoPageObject;
import DemoPage.OrdersPageObject;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyComplsit implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer I1= (Integer) o1;
        Integer I2= (Integer) o2;
        return I2.compareTo(I1);
    }
}
public class Day1 extends Base
{

    /**
     * always run is used in case of Grouping,otherwise TestNG will not pick this for executiom
     */
    @BeforeTest(alwaysRun = true)
    public void StartMet() {
        Initialize();
    }

   @AfterTest
    public void EndMet() {

        driver.quit();

    }






    @Test
    public void ArrangeProduct() throws InterruptedException, IOException {
        DemoPageObject obj = new DemoPageObject(driver);
           System.out.println("--Before Sorting--");
            List<Integer> oList= new ArrayList<>();
            for(WebElement price:obj.Getlprice()){
                Integer i= Integer.valueOf(price.getText());
                oList.add(i);
            }
            System.out.println(oList);
            Collections.sort(oList,new MyComplsit());
            for(WebElement wl : obj.GetDropDwon()){
                if(wl.getText().contains("Highest to lowest"))
                {
                    wl.click();
                }
            }
            System.out.println("--After  Sorting--");
            List<Integer> nList= new ArrayList<>();
            for(WebElement nprice:obj.Getlprice()){
                Integer i= Integer.valueOf(nprice.getText());
                nList.add(i);
            }
            System.out.println(nList);
            if(nList.equals(oList)){
                System.out.println("--List is Sorted--");
            }

    }

    @Test
    public void OrderVerify()  {
        OrdersPageObject objOrders= new OrdersPageObject(driver);
        objOrders.navigateOrderpage();
        objOrders.Setusername();
        objOrders.Setpassword();;
    }
}
