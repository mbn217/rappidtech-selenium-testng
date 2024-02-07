package session1.assertion_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

    @Test
    void calculator(){
        int expectedResult = 15;
        int a = 10;
        int b = 5;
        int actualResult = a+b; //15

        Assert.assertEquals(actualResult , expectedResult);
    }

    @Test
    void compareName(){
        String name1 = "Bill";
        String name2 = "Bill";
        Assert.assertEquals(name1,name2);
    }



}
