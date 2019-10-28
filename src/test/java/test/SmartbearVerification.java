package test;
//TC	#1:	Smartbear	software	link	verification1.
// Open	browser
//2.Go	to	website:
// http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
// 3.Enter username: “Tester”
// 4.Enter password: “test”
// 5.Click to Login button
// 6.Print out count of all the links on landing page
// 7.Print out each link text on this page


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartbearVerification {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        /*
        TC #1: Smartbear software link verification
        1. Open browser
        2. Go to website:
         */
        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


        //3. Enter username: “Tester”

        WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));

        //4. Enter password: “test”

        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));

        //5. Click to Login button

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

        inputUsername.sendKeys("Tester");
        inputPassword.sendKeys("test");
        loginButton.click();

        //6. Print out count of all the links on landing page

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("The number of links on this page: " + listOfLinks.size());

        //7. Print out each link text on this page

        for (WebElement link : listOfLinks) {
            //System.out.println(link); //this will print out the object reference
            System.out.println(link.getText());
        }
    }

        public static void loginToSmartbear(WebDriver driver){

            WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));

            WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));

            WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));

            inputUsername.sendKeys("Tester");
            inputPassword.sendKeys("test");
            loginButton.click();

        }



}




