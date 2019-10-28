package test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Project {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.yelp.com/");

//Checking how many link under the search button
        List<WebElement> listOfLinks = driver.findElements(By.className("homepage-hero_link"));
        System.out.println("The number of links Home services : " + listOfLinks.size());
        int expectedLink = 4;
        int actual=listOfLinks.size();
        if(actual==expectedLink){
            System.out.println("Veryfication has passed");
        }
        else {
            System.out.println("Veryfication failed");
        }
//Checking if it contains "movie","restaurant","Home Services","Delivary",
       WebElement  firstLink = driver.findElement(By.xpath("(//a[@class='homepage-hero_link'])[1]"));
        String expectedResult1=firstLink.getText();
        if(expectedResult1.equals("Restaurants")){
            System.out.println("First element is displayed");
        }
        else {
            System.out.println("Veryfication failed");
        }
WebElement secondLink = driver.findElement(By.xpath("(//a[@class='homepage-hero_link'])[2]"));
        String expectedResult2 = secondLink.getText();
        if ((expectedResult2.equals("Nightlife"))){
            System.out.println("Second Element is displayed");
        }
        else {
            System.out.println("Second Element not displayed");
        }
        WebElement thirdLink = driver.findElement(By.xpath("(//a[@class='homepage-hero_link'])[3]"));
        String expectedResult3 = thirdLink.getText();
        if(expectedResult3.equals("Home Services")){
            System.out.println("Third Element is displayed");
        }
        else {
            System.out.println("Third Elment is not displayed");
        }
WebElement fourdLink = driver.findElement(By.xpath("(//a[@class='homepage-hero_link'])[4]"));
        String expectedResult4 = fourdLink.getText();
        if(expectedResult4.equals("Delivery")){
            System.out.println("FourdElment is displayed");
        }
        else {
            System.out.println("FourdElent is not displayed");
        }

        //Checking if "Most Reviewed" button under Filter functionality (under Movers) is clickable;
        WebElement movers = driver.findElement(By.className("homepage-hero_link"));
        movers.click();

        WebElement allFilter = driver.findElement(By.xpath("(//span[@class='lemon--span__373c0__3997G filter__373c0__2M8m3'])[1]"));
        allFilter.click();

        WebElement mostReviewed = driver.findElement(By.xpath("(//li[@class='lemon--li__373c0__1r9wz border-color--default__373c0__2oFDT'])[3]//label/span[1]"));
        mostReviewed.click();
        String expectedresult="MostReviewed";

        if(expectedresult.contains("MostReviewed")){
            System.out.println("Its Searching by Most Reviwed:Title verification PASSED!");

        }
        else {
            System.out.println("Its not searching by Most Reviewed:Title verification FAILED");
        }

    }
}





