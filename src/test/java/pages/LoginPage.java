package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);

    }
    public  void orangeLogin(String userName,String password){
       userNameInput.sendKeys(userName);
       passwordInput.sendKeys(password);
       loginButton.click();
    }

    @FindBy(id = "txtUsername")
    public WebElement userNameInput;

    @FindBy(id = "txtPassword")
    public WebElement passwordInput;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;
}