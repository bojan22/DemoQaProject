package Pages.BookStoreApplicationPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class ProfilePage {
    WebDriver driver;
    WebDriverWait wait;

    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
