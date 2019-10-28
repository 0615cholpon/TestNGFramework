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

public class SmartbeerEditOrder {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }
    @Test
    public void deleate(){
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartbearVerification.loginToSmartbear(driver);
        List<WebElement>CheckBox = driver.findElements(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector"));

        for(WebElement boxes: CheckBox){
            boxes.click();
        }
        driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();
       // Assert.assertEquals("T");

    }
}
