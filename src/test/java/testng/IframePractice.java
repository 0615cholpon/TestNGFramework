package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void informationTest() throws InterruptedException{

        driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        String actualText = driver.findElement(By.id("result")).getText();
        String expectedText = "You successfuly clicked an alert";

        Assert.assertEquals(actualText, expectedText, "Texts in first test does not match!");

    }

    @Test (priority = 1)
    public void confirmationTest() throws InterruptedException{
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.accept();

        String actualText = driver.findElement(By.id("result")).getText();
        String expectedText = "You clicked: Ok";

        Assert.assertTrue(actualText.equals(expectedText), "Texts in second test does not match");

    }

    @Test (priority = 2)
    public void promptTest() throws InterruptedException{

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.sendKeys("Hello");
        Thread.sleep(3000);
        alert.accept();

        String actualText = driver.findElement(By.id("result")).getText();
        String expectedText = "You entered: Hello";

        Assert.assertTrue(actualText.equals(expectedText), "Texts in third test does not match");

    }

}

