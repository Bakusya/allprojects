import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo1 {

       @Test
               public void testAmazonPage() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.amazon.com/");
            System.out.println(driver.getCurrentUrl());
            Thread.sleep(5000);
            driver.close();

        }

        @Test
    public void testTitleAmazon(){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.amazon.com/");
            System.out.println(driver.getCurrentUrl());

            String expectedTitle = "Amazon.com. Spend less. Smile more.";
            Assert.assertEquals(expectedTitle,driver.getTitle());
            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            driver.close();
        }

        @Test

    public void  testGoogleSearchField(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\UI Automation\\Drivers\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://www.google.com/");
            System.out.println(driver.getCurrentUrl());
            String expectedGoogleTitle = "Google";
            Assert.assertEquals(expectedGoogleTitle,driver.getTitle());
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Bishkek");

            try {
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            driver.close();



        }
    }

