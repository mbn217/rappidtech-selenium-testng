package session2;

import com.google.common.base.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoWebsiteChallenge {
        WebDriver driver;
    @BeforeMethod
    void setup() throws InterruptedException {
        //Step 1 : Set the driver path
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver");
        //Step 2 : Create an instance of ChromeDriver
        driver = new ChromeDriver(); // Upcasting
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @AfterMethod
    void tearDown(){
        driver.quit();
    }



    /**
     *     Test Case 1:
     *     Navigate to https://www.saucedemo.com/
     *     Enter “standard_user” into username and “secret_sauce” into passwords
     *     Verify that “Swag Labs” lable is displayed
     */

    @Test
    void verifyMainLabel(){
        //enter username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        //enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        //click on login button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        //verify that label
        WebElement label = driver.findElement(By.xpath("(//div[.='Swag Labs'])[2]"));
        Assert.assertEquals(label.isDisplayed() , true);
    }


     /**
     *     Test Case 2:
     *     Navigate to https://www.saucedemo.com/
     *     Enter “locked_out_user” into username and “secret_sauce” into passwords
     *     Verify that The Error message “Epic sadface: Sorry, this user has been locked out.” is displayed
     */
     @Test
    void verifyLockedOutUser(){
         driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("locked_out_user");
         //enter password
         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
         //click on login button
         driver.findElement(By.xpath("//input[@id='login-button']")).click();
         //Error locked element
         WebElement errorLockedOutMessage = driver.findElement(By.xpath("//h3[.='Epic sadface: Sorry, this user has been locked out.']"));
         String lockedOutText = errorLockedOutMessage.getText();
         Assert.assertEquals(lockedOutText , "Epic sadface: Sorry, this user has been locked out." );

         boolean lockedOutMessageDisplayed = errorLockedOutMessage.isDisplayed();
         Assert.assertEquals(lockedOutMessageDisplayed  , true );


     }





}
