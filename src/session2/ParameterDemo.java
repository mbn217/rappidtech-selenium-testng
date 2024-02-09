package session2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {

    @Test
    @Parameters({"num1", "num2"})
    void addition(int a , int b){
        int sum = a + b;
        System.out.println(sum);
    }

}
