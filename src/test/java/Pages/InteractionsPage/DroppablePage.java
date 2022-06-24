package Pages.InteractionsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class DroppablePage {
    WebDriver driver;
    WebDriverWait wait;

    public DroppablePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
