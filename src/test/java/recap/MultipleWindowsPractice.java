package recap;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import utilities.TestBase;

public class MultipleWindowsPractice extends TestBase {

    @Test
    public void multipleWindows(){
        driver.get("http://practice.cybertekschool.com/windows");
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://amazon.com','_blank');");


    }
    @Test
    public void switchWindow(){
        String mainHandle=driver.getWindowHandle();
        //System.out.println("Title before clicking:"+driver.getTitle());

        for(String handle:driver.getWindowHandles()){
           if (!handle.equals(mainHandle)){
               driver.switchTo().window(handle);
               if(driver.getTitle().equals("Etsy")){
                   break;
               }
           }


        }
        System.out.println(driver.getCurrentUrl());
    }
}
