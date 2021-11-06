import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Demo5 {

    @Test
    public void test312() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Donald");
        driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Tramp");
        driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("tramp@gmail.com");
        WebElement genderCheckBox = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        genderCheckBox.click();
        driver.findElement(By.xpath("//*[@id='userNumber']")).sendKeys("+996312362514");
        driver.findElement(By.id("dateOfBirthInput")).click();

        Select month = new Select(driver.findElement(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")));
        month.selectByIndex(11);
        // driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();


    }

    @Test
    public void testWebTable() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.xpath("//span[@id='delete-record-1']//*[local-name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")).click();
        driver.findElement(By.xpath("//span[@id='delete-record-2']//*[local-name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")).click();
        driver.findElement(By.xpath("//span[@id='delete-record-3']//*[local-name()='svg']//*[name()='path' and contains(@d,'M864 256H7')]")).click();
        WebElement addButton = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
        addButton.click();
        WebElement name = driver.findElement(By.xpath("//*[@id='firstName']"));
        name.sendKeys("Tom");
        WebElement lastName = driver.findElement(By.xpath("//*[@id='lastName']"));
        lastName.sendKeys("Hardy");
        WebElement email = driver.findElement(By.xpath("//*[@id='userEmail']"));
        email.sendKeys("tom@gmail.com");
        WebElement age = driver.findElement(By.xpath("//*[@id='age']"));
        age.sendKeys("43");
        WebElement salary = driver.findElement(By.xpath("//*[@id='salary']"));
        salary.sendKeys("100000");
        WebElement department = driver.findElement(By.xpath("//*[@id='department']"));
        department.sendKeys("Actor");
        WebElement submitButton = driver.findElement(By.xpath("//*[@id='submit']"));
        submitButton.click();
        Thread.sleep(3000);

        addButton.click();
        new WebDriverWait(driver, 10)
                .ignoring(StaleElementReferenceException.class)
                .until((WebDriver d) -> {
                    d.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Morgan");
                    d.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Freeman");
                    d.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("freeman@gmail.com");
                    d.findElement(By.xpath("//*[@id='age']")).sendKeys("84");
                    d.findElement(By.xpath("//*[@id='salary']")).sendKeys("80000");
                    d.findElement(By.xpath("//*[@id='department']")).sendKeys("Actor");
                    d.findElement(By.xpath("//*[@id='submit']")).click();
                    return true;
                });
        WebElement search = driver.findElement(By.xpath("//*[@id='searchBox']"));
        search.sendKeys("Tom");
        Assert.assertEquals("Tom", driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[1]")).getText());
        driver.findElement(By.xpath("//*[@id='searchBox']")).sendKeys(Keys.CONTROL, "A");
        driver.findElement(By.xpath("//*[@id='searchBox']")).sendKeys(Keys.BACK_SPACE);
        Thread.sleep(2000);

//        addButton.click();
//        name.sendKeys("Omar");
//        lastName.sendKeys("Si");
//        email.sendKeys("Omarsi@gmail.com");
//        age.sendKeys("43");
//        salary.sendKeys("150000");
//        department.sendKeys("Actor");
//        submitButton.click();
//

    }


}

