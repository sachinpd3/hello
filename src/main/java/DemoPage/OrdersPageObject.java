package DemoPage;

import Reusable.AbstractComponent;
import Reusable.CustomWebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrdersPageObject extends AbstractComponent {
    WebDriver driver;
    public OrdersPageObject(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="#orders")
    WebElement orders;

    @FindBy(xpath = "//*[text()='Select Username']")
    WebElement username;

    //*[text()='Select Username']/..//input
    @FindBy(xpath = "//*[text()='Select Username']/..//input")
    WebElement usernameEdit;

    @FindBy(xpath = "//*[text()='Select Password']")
    WebElement password;

    //*[text()='Select Username']/..//input
    @FindBy(xpath = "//*[text()='Select Password']/..//input")
    WebElement passwordEdit;

    @FindBy(css="#login-btn")
    WebElement LogIn;

    public void navigateOrderpage(){

        CustomWebElement obj=new CustomWebElement(orders);
        obj.click();
    }


    public void Setusername(){
        WaitForElement(username);
        Actions action = new Actions(driver);
        action.moveToElement(username).click().perform();
        usernameEdit.sendKeys("demouser",Keys.ENTER);
       // action.sendKeys(Keys.ENTER);
    }

    public void Setpassword(){
        Actions action = new Actions(driver);
        action.moveToElement(password).click().perform();
        passwordEdit.sendKeys("testingisfun99",Keys.ENTER);
        action.sendKeys(Keys.ENTER);
        LogIn.click();

    }

}
