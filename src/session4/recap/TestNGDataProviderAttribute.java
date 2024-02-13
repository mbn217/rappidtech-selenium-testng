package session4.recap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGDataProviderAttribute {

    /**
     * DataProvider contains only one single attribute , which is its name
     * DataProvider are not declarted on tip of the function like Parameter
     *
     */

    @DataProvider(name = "data-provider-example")
    public Object[][] dataProviderMethod(){
        return new Object[][] {{"aaaaaaa"} , {"xxxxxxxxxx"}};
    }
    @Test(dataProvider = "data-provider-example")
    void demo(String value){
        System.out.println("Passed Parameter   ---  " + value);
    }

    @DataProvider(name = "data-provider-example-calc")
    public Object[][] dataProviderMethodCal(){
        return new Object[][] {{3, 4} , {4,6} ,
                {10,5} };
    }

    @Test(dataProvider = "data-provider-example-calc")
    void calculator(int num1, int num2){
        int result = num1 + num2;
        System.out.println(" The result of the addition of " + num1 + " + " + num2 + " is equal to :  "+ result);
    }

}
