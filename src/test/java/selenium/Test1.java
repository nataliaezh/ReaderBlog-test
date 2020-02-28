package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseUITest{
    @Test
    public void testURL(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8188/readerblog.com");
        driver.manage().window().maximize();
        driver.getPageSource().contains("Reader");
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void testIndexPage(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8188/readerblog.com");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getPageSource().contains("Reader"));
        driver.quit();
    }


    @Test
    public void testLogin() {
        driver.get("http://localhost:8188/readerblog.com");
        driver.findElement(By.cssSelector("#navLoginField")).sendKeys("11111");
        driver.findElement(By.cssSelector("#navPasswordField")).sendKeys("100");
        driver.findElement(By.cssSelector("#navLoginSubmit")).click();
    }

}
