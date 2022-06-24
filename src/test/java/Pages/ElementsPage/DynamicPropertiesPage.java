package Pages.ElementsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class DynamicPropertiesPage {
    WebDriver driver;
    WebDriverWait wait;

    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
