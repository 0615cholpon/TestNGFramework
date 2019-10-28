package testng;

import org.testng.annotations.Test;

public class DependenciesTestNG {
    @Test
    public void logon(){
        System.out.println("logging in...");
    }
    @Test(dependsOnMethods = "login")
    public void makePurchase(){
        System.out.println("making the purchise");
    }
    @Test
    public void homePage(){
        System.out.println("homePage tested");
    }

}
