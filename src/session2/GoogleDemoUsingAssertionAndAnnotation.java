package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleDemoUsingAssertionAndAnnotation {
        WebDriver driver;


    @BeforeMethod
    void setup() throws InterruptedException {
        //Step 1 : Set the driver path
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver");
        //Step 2 : Create an instance of ChromeDriver
        driver = new ChromeDriver(); // Upcasting
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }




    /**
     * Test case 1:
     * Login to google.com
     * Verify that you are on google by verifying that the About link on the top of the page is present
     */
    @Test
    void verifyAboutHyperLinkInGoogleHomePage() throws InterruptedException {
        WebElement aboutLink = driver.findElement(By.xpath("//a[.='About']"));
        boolean  aboutLinkIsDisplayed = aboutLink.isDisplayed();
        Assert.assertEquals( aboutLinkIsDisplayed , true  );
    }


    /**
     * Test case 1:
     * Login to google.com
     * Verify that the Google logo is displayed
     */
    @Test
    void verifyGoogleLogo() throws InterruptedException {
        WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        Assert.assertEquals(googleLogo.isDisplayed()  , true    );
        driver.quit();
    }















}
