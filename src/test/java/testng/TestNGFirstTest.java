package testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGFirstTest {

    @BeforeClass
    public void setUp(){
        System.out.println("Beforeclass running");
    }
    @AfterClass
    public void tearDown(){
        System.out.println("AfterClass running...");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod running");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod is running");
    }
    @Test
    public void firstTest(){
        System.out.println("This is the first test running");

        Assert.assertEquals("a","b","First test a-b is failed");
    }

    @Test
    public void secondTest(){
        System.out.println("This is the second test running");
    }

    @Test
    public void titleTest(){
        String actualTitle = "Google - Apples";
        String expectedTitleContains = "Apples";

        Assert.assertTrue(actualTitle.contains(expectedTitleContains),"Actual title does not contain expected value");
    }
}
