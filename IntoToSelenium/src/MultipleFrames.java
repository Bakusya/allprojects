import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MultipleFrames {

    @Test
    public void testIFrame() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demoqa.com/frames");

        driver.switchTo().frame("frame1");
        WebElement textInsideFirstFrame = driver.findElement(By.id("sampleHeading"));
        Assert.assertTrue(textInsideFirstFrame.isDisplayed());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement textInsideSecondFrame = driver.findElement(By.id("sampleHeading"));
        Assert.assertTrue(textInsideSecondFrame.isDisplayed());
        driver.close();


    }
    @Test
    public void nestedFrames(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        driver.switchTo().parentFrame();
        driver.switchTo().frame(0);



    }
}
