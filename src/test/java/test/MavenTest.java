package test;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class MavenTest {
    public static void main(String[] args) {
//        System.out.println("Hello,Maven");
//        Faker faker = new Faker();
//
//        System.out.println(faker.name());
//        System.out.println(faker.name().name());

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        Faker faker = new Faker();
        driver.get("https://google.com");

        driver.findElement(By.name("q")).sendKeys(faker.name().name() + Keys.ENTER);

    }
}
