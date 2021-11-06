import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Demo6 {
    @Test

    public void uploadFile() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("http://demo.guru99.com/test/upload/");

        WebElement uploadFileButton = driver.findElement(By.xpath("//*[@id='uploadfile_0']"));
        uploadFileButton.sendKeys("");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();

    }

    @Test
    public void pagenavigation() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("http://www.practiceselenium.com/");
        WebElement teaLink = driver.findElement(By.xpath("//a[contains(@data-title, 'Talk Tea')]"));
        teaLink.click();
        Thread.sleep(2000);
        teaLink = driver.findElement(By.xpath("//a[contains(@data-title, 'Talk Tea')]"));
        WebElement parentOfTeaLink = teaLink.findElement(By.xpath("./.."));
        Assert.assertTrue(parentOfTeaLink.getAttribute("class").equals("active"));
        //to navigate back
        driver.navigate().back();
        //verify welcome is selcted by default
        WebElement welcomeLink = driver.findElement(By.xpath("//a[@data-title='Welcome']/.."));
        Assert.assertTrue(welcomeLink.getAttribute("class").equals("active"));
        //navigate forward
        driver.navigate().forward();
        Thread.sleep(3000);
        WebElement nameInput = driver.findElement(By.xpath("//input[@name='name']"));
        nameInput.sendKeys("Digital Nomads");
        driver.navigate().refresh();
        nameInput = driver.findElement(By.xpath("//input[@name='name']"));
        nameInput.sendKeys(" School");
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void testSlider() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demoqa.com/slider");

        WebElement sliderCircle = driver.findElement(By.xpath("//input[@type='range']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(sliderCircle).moveByOffset(100,0).release().perform();

        int newSliderValue = Integer.parseInt(sliderCircle.getAttribute("value"));
        Thread.sleep(3000);
        Assert.assertTrue(newSliderValue > 25);

    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://demoqa.com/droppable");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.xpath("//div[@id='simpleDropContainer']/div[@id='droppable']"));
        Actions actions  = new Actions(driver);
        actions.dragAndDrop(source, target).perform();
        Thread.sleep(3000);
        WebElement successfulDroped = target.findElement(By.xpath("./p"));
        Assert.assertTrue(successfulDroped.getText().equals("Dropped!"));


    }

    @Test
    public void testExpedia() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.navigate().to("https://www.expedia.com/");



        Thread.sleep(2000);
        WebElement cruisesTab = driver.findElement(By.xpath("//a[@href='?pwaLob=wizard-cruise-pwa']"));
        cruisesTab.click();
        WebElement selectElement = driver.findElement(By.id("cruise-destination"));
        Select dropDown = new Select(selectElement);
        dropDown.selectByValue("alaska");
        Assert.assertTrue(dropDown.getAllSelectedOptions().get(0).getText().equals("Alaska"));
        Thread.sleep(3000);
        dropDown.selectByVisibleText("Africa");
        Assert.assertTrue(dropDown.getAllSelectedOptions().get(0).getText().equals("Africa"));
        dropDown.selectByIndex(3);
        Assert.assertTrue(dropDown.getFirstSelectedOption().getText().equals("Mexico"));
        for (WebElement option : dropDown.getOptions()) {
            System.out.println(option.getText());
        }
    }

        }

