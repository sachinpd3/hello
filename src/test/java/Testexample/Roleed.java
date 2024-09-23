package Testexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Roleed {
    public static void main(String[] args)  {
        int k=1;
        for(int i =1;i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

    }
}
