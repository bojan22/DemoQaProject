package Pages.InteractionsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class ResizablePage {
    WebDriver driver;
    WebDriverWait wait;

    public ResizablePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
