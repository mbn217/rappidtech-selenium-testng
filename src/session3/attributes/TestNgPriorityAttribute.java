package session3.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgPriorityAttribute {


    @Test(priority = 2)
    void testTwo(){
        System.out.println("THis needs to run second");
        Assert.assertEquals(true, false);
    }

    @Test(priority = 3)
    void testThird(){
        System.out.println("THis needs to run third");
        Assert.assertEquals(true, true);
    }

    @Test()
    void testOne(){
        System.out.println("THis needs to run first");
        Assert.assertEquals(true, true);
    }






}
