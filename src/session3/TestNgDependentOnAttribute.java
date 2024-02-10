package session3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDependentOnAttribute {


    @Test()
    void login(){
        System.out.println("Login successful");
        Assert.assertEquals(false, true);
    }

    @Test(dependsOnMethods = "login")
    void verifyDashboardLogo(){
        System.out.println("Label is displayed");
    }





}
