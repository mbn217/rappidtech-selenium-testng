package session1;


import org.testng.annotations.Test;

public class TestNGDemo {

    //IDE Eclipse  -- You have to download a testng plugin
    //IDE IntellJ -- Does have the plugin out of the box


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
