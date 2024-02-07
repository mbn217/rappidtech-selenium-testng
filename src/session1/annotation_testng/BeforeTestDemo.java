package session1.annotation_testng;

import org.testng.annotations.*;
@Test
public class BeforeTestDemo {


    @BeforeTest
    void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("after Test");
    }

    @Test
    void testOne(){
        System.out.println("Im Test 1");
    }
    @Test
    void testTwo(){
        System.out.println("Im Test 2");
    }
    @Test
    void testThree(){
        System.out.println("Im Test 3");
    }


    @BeforeClass
    void beforeClass(){
        System.out.println("Im Before Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("Im After class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("after Method");
    }
}
