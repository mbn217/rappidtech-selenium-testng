package session3.attributes;

import org.testng.annotations.Test;

public class TestNgTimeOutAttribute {

    /**
     * timeout will specify how long the test should take
     * if the test take more time then the timeout then it will fail
     *
     */
    @Test(timeOut = 1000, groups = "smoketest")
    void testOne() throws InterruptedException {
        Thread.sleep(1000);
    }







}
