package test;
//PRACTICE	#4:	Method:	verifyOrder
//•Create	a	method	named	verifyOrderthat	takes	WebDriver	object	and	String(name).
//•This	method	should	verify	if	given	name

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearLink {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


       WebElement date = driver.findElement(By.xpath("//td[.='Susan McLaren']/../td[5]"));


        String dateText = date.getText();

        if(dateText.equals("01/05/2010")){
            System.out.println("Susan date verification PASSED!");
        }else{
            System.out.println("Susan date verification FAILED!!!");
        }



    }

}
