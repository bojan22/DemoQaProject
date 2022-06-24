package Pages.BookStoreApplicationPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
