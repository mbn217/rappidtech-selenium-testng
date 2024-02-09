package session2;

import org.testng.annotations.Test;

public class DemoTestNG {


    @Test
    void demo(){
        System.out.println(addition());
        System.out.println("Greeting");
    }

    @Test
    void demoTwo(){
        System.out.println("Hellow Demo two");
    }

    int addition(){
        return 1+4;
    }





}
