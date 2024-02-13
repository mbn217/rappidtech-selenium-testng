package session4.recap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Challenge {
    WebDriver driver;
    @BeforeMethod
    void setup() throws InterruptedException {
        //Step 1 : Set the driver path
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver");
        //Step 2 : Create an instance of ChromeDriver
        driver = new ChromeDriver(); // Upcasting
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @AfterMethod
    void tearDown() {
        driver.quit();
    }


    @Test
    void TC01_verifyLoginWithNoUserName() {
        //Dont enter username
        //Enter password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        //Click on Login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Error message
        WebElement requiredErrorMessage = driver.findElement(By.xpath("//span[.='Required']"));
        Assert.assertEquals(requiredErrorMessage.getText() , "Required");
        // We still in the same page
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals( driver.getCurrentUrl()  , "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Test
    void TC02_verifyLoginWithNoPassword() {
        //enter username
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        //dont enter password
        //click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        // Error message
        WebElement requiredErrorMessage = driver.findElement(By.xpath("//span[.='Required']"));
        Assert.assertEquals(requiredErrorMessage.getText() , "Required");
        // We still in the same page
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals( driver.getCurrentUrl()  , "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    void TC03_verifySidePanel() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']")).click(); // click on this button if you want to toggle off the side panel
        Thread.sleep(2000);

        WebElement adminLabel= driver.findElement(By.xpath("//span[.='Admin']"));
        Assert.assertEquals(adminLabel.isDisplayed() , true);
    }


}
