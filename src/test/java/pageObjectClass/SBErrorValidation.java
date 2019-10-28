package pageObjectClass;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SBLoginPage;
import utilities.Config;
import utilities.Driver;

public class SBErrorValidation {

    SBLoginPage sbLoginPage = new SBLoginPage();

    @BeforeMethod
    public void beforeMethod(){
        Driver.getDriver().get(Config.getProperty("smartBearUrl"));
    }

    @Test
    public void wrongUsernameErrorMessageVerification(){

//        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys("Admin");
        sbLoginPage.inputUsername.sendKeys("Admin");
//        Driver.getDriver().findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        sbLoginPage.inputPassword.sendKeys("test");
//        Driver.getDriver().findElement(By.id("ctl00_MainContent_login_button")).click();
        sbLoginPage.loginButton.click();

//        WebElement errorMessage = Driver.getDriver().findElement(By.id("ctl00_MainContent_status"));
//        Assert.assertTrue(errorMessage.isDisplayed());

        Assert.assertTrue(sbLoginPage.errorMessage.isDisplayed());

    }

    @Test
    public void wrongPasswordErrorMessageVerification(){

        sbLoginPage.inputUsername.sendKeys("Tester");
        sbLoginPage.inputPassword.sendKeys("wrong password");
        sbLoginPage.loginButton.click();

        Assert.assertTrue(sbLoginPage.errorMessage.isDisplayed());

    }

    @Test
    public void noUserNameErrorMessageVerification(){
        sbLoginPage.inputUsername.sendKeys("");
        sbLoginPage.inputPassword.sendKeys("test");
        sbLoginPage.loginButton.click();

        Assert.assertTrue(sbLoginPage.errorMessage.isDisplayed());
    }

    @Test
    public void noPasswordErrorMessageVerification(){
        sbLoginPage.inputUsername.sendKeys("Tester");
        sbLoginPage.inputPassword.sendKeys("");
        sbLoginPage.loginButton.click();

        Assert.assertTrue(sbLoginPage.errorMessage.isDisplayed());
    }
}
