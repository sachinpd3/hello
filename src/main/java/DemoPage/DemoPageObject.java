package DemoPage;

import Reusable.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DemoPageObject extends AbstractComponent {
    WebDriver driver;
    public DemoPageObject(WebDriver driver){
        super(driver);
      this.driver=driver;
        PageFactory.initElements(driver,this);
    }

     @FindBy(css="div.val b")
     List<WebElement> lprice;

    @FindBy(css="select option")
    List<WebElement> ListDropDown;

    @FindBy(css=".spinner")
    WebElement spinner;

     public List<WebElement> Getlprice(){
         WaitForDisElement(spinner);
        return lprice;
    }

    public List<WebElement> GetDropDwon(){
        return ListDropDown;
    }

}
