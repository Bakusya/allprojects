import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Alerts {

    @Test
    public void testSimpleAlert() throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
        driver.close();
    }

    @Test

    public void testConfirmationAlert(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.findElement(By.id("timerAlertButton")).click();

        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        driver.close();

    }

    @Test
    public void test1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demoqa.com/alerts");
        driver.findElement(By.id("confirmButton")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss(); //отмена
        Thread.sleep(3000);
        WebElement result = driver.findElement(By.id("confirmResult"));
        System.out.println(result.getText());
        driver.close();
    }

    @Test
    public void testPromptAlert() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demoqa.com/alerts");
        driver.findElement(By.id("promtButton")).click();

        Alert alert = driver.switchTo().alert();
        String text = "Hello World";
        alert.sendKeys(text);
        alert.accept();
        Thread.sleep(4000);
        driver.close();


    }

}