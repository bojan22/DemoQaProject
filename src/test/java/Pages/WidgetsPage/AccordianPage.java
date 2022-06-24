package Pages.WidgetsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class AccordianPage {
    WebDriver driver;
    WebDriverWait wait;

    public AccordianPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
