package session3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgAlwaysRunAttribute {


    @Test()
    void login(){
        System.out.println("Login successful");
        Assert.assertEquals(false, true);
    }

    @Test(dependsOnMethods = "login" , alwaysRun = true)
    void verifyDashboardLogo(){
        System.out.println("Label is displayed");
    }





}
