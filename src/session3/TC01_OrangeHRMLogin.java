package session3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC01_OrangeHRMLogin {
    WebDriver driver;


    @BeforeMethod
    void setup() throws InterruptedException {
        //Step 1 : Set the driver path
        System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver");
        //Step 2 : Create an instance of ChromeDriver
        driver = new ChromeDriver(); // Upcasting
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
    }

    @Test
    void verifyLogo() throws InterruptedException {
        WebElement imageLogo = driver.findElement(By.xpath("//img[@alt='client brand banner']"));
        Assert.assertEquals(imageLogo.isDisplayed() , true);
    }

    @Test
    void verifyTheDashBoardLabel(){
        WebElement dashboardLabel = driver.findElement(By.xpath("//h6[.='Dashboard']"));
        Assert.assertEquals(dashboardLabel.isDisplayed(), true );
        Assert.assertEquals(dashboardLabel.getText() , "About");
    }





    @AfterMethod
        void tearDown(){
        driver.quit();

    }







}
