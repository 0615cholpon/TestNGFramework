package explicitWaitClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utilities.Driver;

public class DynomicalyLoaded {

    @BeforeMethod
    public void waitUntil(){
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");


    }
}
