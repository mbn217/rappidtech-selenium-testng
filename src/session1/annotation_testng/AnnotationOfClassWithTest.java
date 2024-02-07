package session1.annotation_testng;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationOfClassWithTest {



    @BeforeMethod
    void greeting(){
        System.out.print("Mohamed ");
    }
    @Test
    void greeting2(){
        greeting();
        System.out.println("Good morning");
    }
    @Test
    void greeting3(){
        System.out.println("Good night");
    }

}
