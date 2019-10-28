package explicitWaitClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicWaitPage;
import utilities.Driver;

public class ExplicitPractice {

    @Test
    public void waitingExplicitly() {
        WebElement googleSearch = Driver.getDriver().findElement(By.name("q"));
        // 1- I need to create an object from WebDriverWait class
        // 2- Pass two arguments inside: first argument is driver,second is the time that
        //I want to wait until

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //3- Use object that I created from WebDriverWait and create the certain condition
        //that I want to wait for

        WebElement googleWait = wait.until(ExpectedConditions.visibilityOf(googleSearch));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath")));
        googleWait.sendKeys("search for something");

    }
    DynamicWaitPage dynamicWaitPage = new DynamicWaitPage();

    @Test
    public void cybertekDynamicWait() throws InterruptedException {

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        dynamicWaitPage.startButton.click();
        System.out.println("text of helloworld--> " + dynamicWaitPage.helloWorldText.getText());
        System.out.println("Waiting for 10 seconds");
        Thread.sleep(10000);
        System.out.println("text of helloworld--> " + dynamicWaitPage.helloWorldText.getText());

        dynamicWaitPage.inputUsername.sendKeys("tomsmith");
        dynamicWaitPage.inputPassword.sendKeys("SuperSecretPassword");
        dynamicWaitPage.submitButton.click();


    }
}