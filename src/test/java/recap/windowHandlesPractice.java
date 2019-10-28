package recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class windowHandlesPractice {
   public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/windows");
    }
@Test
    public void cybertekWindow(){
    System.out.println("Title before clicking:"+driver.getTitle());
    String mainHandle = driver.getWindowHandle();
    driver.findElement(By.linkText("Cybertek School")).click();

    for(String handle:driver.getWindowHandles()){

        System.out.println(handle);
        if(!handle.equals(mainHandle)){
            driver.switchTo().window(handle);
                    break;
        }
    }

}


}
