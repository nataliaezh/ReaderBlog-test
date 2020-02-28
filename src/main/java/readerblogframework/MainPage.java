package readerblogframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions {
    public static final String HOMEPAGE = "http://localhost:8188/readerblog.com";

    private static final By FIELD_LOGIN = By.cssSelector("#navLoginField");
    private static final By FIELD_PASSWORD = By.cssSelector("#navPasswordField");
    private static final By BTN_SUBMIT_LOGIN = By.cssSelector("#navLoginSubmit");
    private static final By BTN_LOGOUT = By.cssSelector("#navLogout");

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void login(String username, String password) {
        type(FIELD_LOGIN, username);
        type(FIELD_PASSWORD, password);
        driver.findElement(BTN_SUBMIT_LOGIN).click();
    }
}