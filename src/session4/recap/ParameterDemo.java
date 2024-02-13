package session4.recap;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {


    @Test
    @Parameters({"abc", "xyz"})
    void demoTest( String username , String password){
        System.out.println(username);
        System.out.println(password);
    }


}
