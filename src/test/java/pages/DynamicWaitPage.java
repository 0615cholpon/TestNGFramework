package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class DynamicWaitPage {

  public DynamicWaitPage() {
      PageFactory.initElements(Driver.getDriver(), this);
  }
    @FindBy(xpath = "//button[.='Start']")
    public WebElement startButton;

    @FindBy(xpath = "//h4[.='Hello World!']")
    public WebElement helloWorldText;

    @FindBy(id = "username")
    public WebElement inputUsername;

    @FindBy(id = "pwd")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(className = "subheader")
    public WebElement subheader;
}
