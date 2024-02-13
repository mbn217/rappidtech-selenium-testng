package session4.recap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenCloseBroswerDemo {


    @Test
    @Parameters({"browser"})
    void testOne(String browser) throws InterruptedException {
        WebDriver driver = null;
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver");
            driver = new ChromeDriver();
        }else{
            System.out.println("running for firefox");
        }


        Thread.sleep(2000);
        driver.close();
    }
    @Test
    @Parameters({"browser"})
    void testThree(String browser) throws InterruptedException {
        WebDriver driver = null;
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver");
            driver = new ChromeDriver();
        }else{
            System.out.println("running for firefox");
        }


        Thread.sleep(2000);
        driver.close();
    }
    @Test
    @Parameters({"browser"})
    void testTwo(String browser) throws InterruptedException {
        WebDriver driver = null;
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver");
            driver = new ChromeDriver();
        }else{
            System.out.println("running for firefox");
        }


        Thread.sleep(2000);
        driver.close();
    }

    @Test

    void gecko() throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "./browserdrivers/geckodriver 3");
        WebDriver driver = new FirefoxDriver();
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette",true);
        driver= new FirefoxDriver(capabilities);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(2000);
        driver.close();
    }
}
