import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {

    @Test
    public void etsyExplicitWait() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://www.etsy.com/");

        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
        WebDriverWait wait = new WebDriverWait(driver,15);
        WebElement google = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='join-neu-form']/div[3]/div[1]/div/button")));
        Assert.assertTrue(google.isDisplayed());
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void test12() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demoqa.com/dynamic-properties");

        WebElement willEnableButton = driver.findElement(By.id("enableAfter"));

        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(willEnableButton));
        Thread.sleep(3000);
        Assert.assertTrue(willEnableButton.isEnabled());


    }
}
