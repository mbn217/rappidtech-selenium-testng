package session2;

import org.testng.annotations.*;

public class AnnotationDemo {

    @Test
    void greeting(){
        System.out.println("Im test method");
    }
    @Test
    void greetingTwo(){
        System.out.println("Im test method two");
    }


    @BeforeMethod
    void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("After method");
    }


    @BeforeClass
    void beforeClass(){
        System.out.println("Before class method");
    }

    @AfterClass
    void afterClass(){
        System.out.println("After class method");
    }


    @BeforeTest
    void beforeTest(){
        System.out.println("Before test  method");
    }

    @AfterTest
    void afterTest(){
        System.out.println("After test method");
    }


    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before suite method");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("After suite method");
    }



}
