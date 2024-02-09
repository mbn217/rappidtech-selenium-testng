package session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SauceDemoWebsiteChallengeTwo {
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
     *     Verify that all the items are matching the vales below
     *     Sauce Labs Backpack
     *     Sauce Labs Bike Light
     *     Sauce Labs Bolt T-Shirt
     *     Sauce Labs Fleece Jacket
     *     Sauce Labs Onesie
     *     Test.allTheThings() T-Shirt (Red)
     */

    @Test
    void verifyMainLabel() throws InterruptedException {
        ArrayList<String> expectedItem = new ArrayList<>(List.of("Sauce Labs Backpack","Sauce Labs Bike Light","Sauce Labs Bolt T-Shirt",
                "Sauce Labs Fleece Jacket","Sauce Labs Onesie","Test.allTheThings() T-Shirt (Red)"));
        //enter username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        //enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        //click on login button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000); // change to wait for a label to be present in the main page after login , explicit wait
        List<WebElement> listOfItems = driver.findElements(By.xpath("//div[@class='inventory_item_name ']"));
        ArrayList<String> actualItem = new ArrayList<>();
        for (WebElement item : listOfItems) {
            //System.out.println(item.getText());
            actualItem.add(item.getText());
        }
        Assert.assertEquals(actualItem , expectedItem);

    }




}
