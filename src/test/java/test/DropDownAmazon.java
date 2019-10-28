package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDownAmazon {
    public static void main(String[] args) throws  InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");

       WebElement search = driver.findElement(By.id("searchDropdownBox"));
       Select dropDown=new Select(search);
       String str=dropDown.getFirstSelectedOption().getText();
       System.out.println(str);
       Thread.sleep(3000);
       dropDown.selectByIndex(1);


    }
}
