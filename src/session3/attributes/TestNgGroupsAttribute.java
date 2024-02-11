package session3.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgGroupsAttribute {



    @Test(groups = "smoketest")
    void verifyLogin(){
        System.out.println("verifying login");
    }
    @Test(groups = "smoketest")
    void verifySignout(){
        System.out.println("verifying signout");
    }


    @Test(groups = "regression")
    void verifyDashboardlabel(){
        System.out.println("Verify dashboard label");
    }






}
