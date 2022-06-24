package Pages.WidgetsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class ProgressBarPage {
    WebDriver driver;
    WebDriverWait wait;

    public ProgressBarPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
