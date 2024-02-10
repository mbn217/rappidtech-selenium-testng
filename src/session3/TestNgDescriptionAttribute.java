package session3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDescriptionAttribute {


    @Test(description = "This is a test case for greeting someone")
    void greeting(){
        System.out.println("Greeting");
        Assert.assertEquals(true, true);
    }


    @Test(description = "This is a test case for food")
    void eat(){
        System.out.println("eat");
        Assert.assertEquals(true, true);
    }




}
