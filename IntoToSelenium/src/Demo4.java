import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Demo4 {

    @Test
    public void testEnterKey() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https://www.amazon.com/");

        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
        searchField.sendKeys("iphone" + Keys.ENTER );
        Thread.sleep(4000);

        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']"));
        for (WebElement brand : brands) {
            System.out.println(brand.getText());

        }
        driver.close();


    }

    @Test

    public void testHR() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.xpath("//*[@id='welcome']")).getText();
        String expectedMessage = "Welcome Paul";
        Assert.assertEquals(expectedMessage, actualResult);
        driver.findElement(By.xpath("//*[@id='welcome']")).click();
        Thread.sleep(1000);
        driver.close();




    }

    @Test
    public void testDoubleClick() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();

        WebElement doubleClickMessage = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
        Thread.sleep(4000);
        String expectedMessage = "You have done a double click";
        Assert.assertEquals(expectedMessage, doubleClickMessage.getText());
        driver.close();


    }

    @Test
    public void testRightClick() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https://demoqa.com/buttons");
        WebElement rightClick = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightClick).perform();
        Thread.sleep(2000);
        WebElement actualMessage = driver.findElement(By.xpath("//*[@id='rightClickMessage']"));
        Thread.sleep(2000);
        String expectedMessage = "You have done a right click";
        Assert.assertEquals(expectedMessage, actualMessage.getText());
        driver.close();


    }

    @Test
    public void clickMeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https://demoqa.com/buttons");

        WebElement clickMe = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
        clickMe.click();
        WebElement actualMessage = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
        Thread.sleep(3000);
        String expectedMessage = "You have done a dynamic click";
        Assert.assertEquals(expectedMessage, actualMessage.getText());
        Thread.sleep(2000);
        driver.close();


    }
}