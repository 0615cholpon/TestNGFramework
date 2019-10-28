package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.SmartbearVerification;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartbearEditOrder {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Test
    public void change() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartbearVerification.loginToSmartbear(driver);
        List<WebElement> change = driver.findElements(By.xpath("(//input[@alt='Edit'])[3]"));
        for (WebElement clik : change) {
            clik.click();
        }
        WebElement name = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        name.clear();
        name.sendKeys("Michael Jordan");
        WebElement update = driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton"));
        update.click();

        WebElement edit = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        Assert.assertTrue(edit.isDisplayed(),"The name isnt updated");


    }
}