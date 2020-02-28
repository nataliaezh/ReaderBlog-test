package readerblogframework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseActions {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void type(By by, String text) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        type(driver.findElement(by), text);
    }

    private void type(WebElement element, String text) {
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}
