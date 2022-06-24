package Pages.WidgetsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class AutoCompleatePage {
    WebDriver driver;
    WebDriverWait wait;

    public AutoCompleatePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
