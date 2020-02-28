package selenium;

import com.geekbrains.september.market.framework.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseUITest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected MainPage mainPage;

    @BeforeTest
    public void init() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        driver.manage().window().maximize();
        mainPage = new MainPage(driver, wait);
    }

    @AfterTest
    public void shutdown() {
        driver.quit();
    }
}
