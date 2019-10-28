package data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.Config;
import utilities.Driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestData {
    @Test
    public void m() throws IOException {

        Properties p = new Properties();
        String path = "test.properties";
        FileInputStream file = new FileInputStream(path);
        p.load(file);
        System.out.println(p.getProperty("username"));
        System.out.println(p.getProperty("password"));
    }

    @Test
            public void test() {
            Driver.getDriver().get("https://www.google.com/");
            WebElement search = Driver.getDriver().findElement(By.name("q"));
            search.sendKeys(Config.getProperty("search") + Keys.ENTER);

        }
    

    public void search(String word) {
        Driver.getDriver();

    }
}