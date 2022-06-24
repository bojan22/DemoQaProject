package Pages.BookStoreApplicationPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class BookStorePage {
    WebDriver driver;
    WebDriverWait wait;

    public BookStorePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
