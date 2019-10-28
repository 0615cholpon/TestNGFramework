package recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import test.SmartbearVerification;
import utilities.TestBase;

public class SmartBearTest extends TestBase {
    public static void removeName(WebDriver driver,String name){
//        String word = "word";
//        String sentence = "//xpath"+word+"rest of the xpath";

        WebElement nameCheckBox = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid'z]//td[.='"+ name+ "']/../td[1]"));
        nameCheckBox.click();
      WebElement deleteButton =  driver.findElement(By.id("ctl00_MainContent_btnDelete"));
      deleteButton.click();

    }
    @Test
    public void smartBear()throws InterruptedException{
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        SmartbearVerification.loginToSmartbear(driver);
        Thread.sleep(1000);
        removeName(driver,"Steve Johns");
    }
}
