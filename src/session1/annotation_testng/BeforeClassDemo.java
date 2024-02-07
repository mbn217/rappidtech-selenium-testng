package session1.annotation_testng;

import org.testng.annotations.*;

public class BeforeClassDemo {


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


    @BeforeClass
    void beforeClass(){
        System.out.println("Im Before Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("Im After class");
    }



}
