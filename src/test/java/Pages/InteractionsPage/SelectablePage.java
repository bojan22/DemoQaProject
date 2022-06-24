package Pages.InteractionsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class SelectablePage {
    WebDriver driver;
    WebDriverWait wait;

    public SelectablePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
