package session1.annotation_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo {
    WebDriver driver ;

    @BeforeMethod
    void setupBrowser() throws InterruptedException {
        //Step 1 : Set the driver path
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver");
        //Step 2 : Create an instance of ChromeDriver
        driver = new ChromeDriver(); // Upcasting
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @Test
    void verifyTitle(){
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle); // verifying your test case
    }
    @Test
    void verifyAboutLink(){
        String expectedResult = "About";
        String actualResult = driver.findElement(By.xpath("//a[.='About']")).getText();
        Assert.assertEquals(actualResult, expectedResult);
    }
    @AfterMethod
    void tearDown(){
        driver.quit();
    }

}
