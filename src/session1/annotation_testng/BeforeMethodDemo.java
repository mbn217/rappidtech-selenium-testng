package session1.annotation_testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodDemo {


    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("after Method");
    }

    @Test
    void testOne(){
        System.out.println("Im Test 1");
    }
    @Test
    void testTwo(){
        System.out.println("Im Test 2");
    }




}
