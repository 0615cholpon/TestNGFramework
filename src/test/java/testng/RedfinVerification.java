package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RedfinVerification {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    public void Search() throws InterruptedException{
        driver.get("https://www.redfin.com");
      WebElement search=  driver.findElement(By.id("search-box-input"));
      search.sendKeys("Naperville"+ Keys.ENTER);


        WebElement minDropdown = driver.findElement(By.xpath("//span[starts-with(@class,'quickMinPrice')]"));
        minDropdown.click();


        WebElement min75k = driver.findElement(By.xpath("//span[starts-with(@class,'quickMinPrice')]//span[.='$75k']"));
        Thread.sleep(1000);
        min75k.click();

        Thread.sleep(1000);

        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        Assert.assertTrue(currentUrl.contains("75k"));


    }
}
