package Pages.AlertsFrameWindowPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class BrowserWindowsPage {
    WebDriver driver;
    WebDriverWait wait;

    public BrowserWindowsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
