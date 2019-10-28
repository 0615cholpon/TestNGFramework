package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class ActionButtonUnderPriceList {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void actionButton()throws InterruptedException{
       Driver.getDriver().get("http://54.148.96.210/web#menu_id=115&action=120&active_id=channel_inbox");

        WebElement userName=Driver.getDriver().findElement(By.id("login"));

        userName.sendKeys("SQLDeveloper");

        WebElement password=Driver.getDriver().findElement(By.id("password"));

        password.sendKeys("KjKtfgrs37");

        WebElement login=Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-primary'])"));
        login.click();
        Driver.getDriver().findElement(By.xpath("(//span[@class='oe_menu_text'])[8]")).click();
        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("(//a[@data-menu-xmlid='point_of_sale.pos_config_menu_action_product_pricelist'])")).click();
        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("(//table[@class='o_list_view table table-condensed table-striped o_list_view_ungrouped']/tbody/tr[3]/td/div/input)[1]")).click();
        Thread.sleep(2000);

        Driver.getDriver().findElement(By.xpath("//div[@class='o_cp_sidebar']")).click();
        Thread.sleep(2000);

        WebElement export = Driver.getDriver().findElement(By.xpath("(//a[@data-index='0'])"));
        Thread.sleep(2000);
        Assert.assertTrue(export.isDisplayed(),"Export button is not displayed");

        WebElement archive = Driver.getDriver().findElement(By.xpath("(//a[@data-index='1'])"));

        Assert.assertTrue(archive.isDisplayed(),"Archive button is not displayed");

        WebElement unarchive = Driver.getDriver().findElement(By.xpath("(//a[@data-index='2'])"));


        Assert.assertTrue(unarchive.isDisplayed(),"Unarchive button is not displayed");

        WebElement delete = Driver.getDriver().findElement(By.xpath("(//a[@data-index='3'])"));

        Assert.assertTrue(delete.isDisplayed(),"Delete button is not displayed");


    }
}