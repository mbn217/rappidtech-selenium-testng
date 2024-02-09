package session2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {



    @Test
    void substraction(){
        Assert.assertEquals(5-2 , 2);
        //                  acutal           expected
    }

    @Test
    void assertCharacter(){
        char charone = 'a';
        char chartwo = 'a';
        Assert.assertEquals(charone, chartwo);
    }

    @Test
    void assertString(){
        String nameOne = "Jill";
        String nameTwo = "Bill";
        Assert.assertNotEquals(nameOne, nameTwo);
    }


}
