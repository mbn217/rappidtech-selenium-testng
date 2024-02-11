package session3.attributes;

import org.testng.annotations.Test;

public class TestNgEnabledAttribute {
    /**
     * this test will not run as its set to enabled = false
     */
    @Test(enabled = false)
    void testOne(){
        System.out.println("test 1");
    }

    /**
     * By deault all test have the enabled attribute = true
     */

    @Test
    void testTwo(){
        System.out.println("test 2");
    }





}
