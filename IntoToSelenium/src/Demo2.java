import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo2 {

    @Test
    public void testAmazonPage() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.amazon.com/");

    }

    @Test
    public void testByID() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        Thread.sleep(2000);
        driver.findElement(By.id("at-cv-lightbox-close")).click();
        driver.findElement(By.id("user-message")).sendKeys("Bishkek ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();

        String expectedMessage = "Bishkek";
        Thread.sleep(2000);
        Assert.assertEquals(expectedMessage,driver.findElement(By.xpath("//*[@id='display']")).getText());
        driver.close();

    }

    @Test
    public void testByXPath() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Elon Mask");
        driver.findElement(By.id("userEmail")).sendKeys("elon@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("USA, Washington");
        driver.findElement(By.id("permanentAddress")).sendKeys("USA,New York");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)","");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='submit']")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='submit']")).isEnabled());

        String name = driver.findElement(By.xpath("//*[@id='name']")).getText();
        System.out.println(name);


        driver.close();



    }
}
