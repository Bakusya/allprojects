import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo3 {

    @Test
    public void wildberries() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.wildberries.ru");
        driver.findElement(By.className("search-catalog__input")).sendKeys("IPhone 12 Pro Max");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='search-catalog__btn search-catalog__btn--search j-btn-search']")).click();
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.xpath("//*[@class='searching-results__title']")).getText();
        String expectedResult = "По запросу";
        Assert.assertTrue(actualResult.contains(expectedResult));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//*[@class='j-thumbnail thumbnail']")).click();

    }

        @Test
        public void testByXPath() throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
            driver.get("https://demoqa.com/radio-button");
            WebElement radioButton = driver.findElement(By.xpath("//*[@class='custom-control-label']"));
            radioButton.click();
            Thread.sleep(2000);
            String expectedYouHaveSelected = driver.findElement(By.xpath("//*[text()='You have selected ']")).getText();
            System.out.println(expectedYouHaveSelected);
            String actualResult = "You have selected Yes";
            Assert.assertEquals(expectedYouHaveSelected,actualResult);
            Assert.assertTrue(radioButton.isEnabled());
            driver.close();


    }

    @Test
    public void testCheckBox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
        driver.get("https://demoqa.com/checkbox");
        Thread.sleep(2000);

        WebElement downButton = driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']"));
        downButton.click();

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/ol/li[1]/span/button")).click();

        WebElement notesCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]"));
        notesCheckBox.click();
        Thread.sleep(2000);
        WebElement commandsCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[2]/span/label"));
        commandsCheckBox.click();
        Thread.sleep(2000);
        Assert.assertTrue(notesCheckBox.isEnabled());
        Assert.assertTrue(commandsCheckBox.isEnabled());

        driver.findElement(By.xpath("//*[@class='rct-icon rct-icon-expand-close']")).click();

        WebElement workSpaceCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[1]/span/label/span[1]"));
        workSpaceCheckBox.click();
        Thread.sleep(2000);
        WebElement officeCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[2]/ol/li[2]/span/label/span[1]"));
        officeCheckBox.click();
        Thread.sleep(2000);
        Assert.assertTrue(workSpaceCheckBox.isEnabled());
        Assert.assertTrue(officeCheckBox.isEnabled());


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,200)","");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/span/button")).click();

        WebElement wordCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[1]/span/label/span[1]"));
        wordCheckBox.click();
        Thread.sleep(2000);
        WebElement excelCheckBox = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[3]/ol/li[2]/span/label/span[1]"));
        excelCheckBox.click();
        Thread.sleep(2000);
        Assert.assertTrue(wordCheckBox.isEnabled());
        Assert.assertTrue(excelCheckBox.isEnabled());

        driver.findElement(By.xpath("//*[@id=\"tree-node\"]/div/button[2]")).click();
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.xpath("//*[@class='display-result mt-4']")).getText();
        String expectedResult = "You have selected";
        Assert.assertTrue(actualResult.contains(expectedResult));



        driver.close();
    }
}
