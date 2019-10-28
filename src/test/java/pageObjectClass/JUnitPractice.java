package pageObjectClass;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class JUnitPractice {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Running before class");

    }
    @Before
    public void before(){
        System.out.println("Running before");
    }
    @Test
    public void test1(){
        System.out.println("Running test1...");
        Assert.assertTrue("This message will be printed when assertion fails",true);
        Assert.assertEquals("my message","expected","actual");
    }
    @Test
    public void test2(){
        System.out.println("Running test2");
    }
}
