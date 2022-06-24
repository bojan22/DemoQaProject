package Pages.WidgetsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class DatePickerPage {
    WebDriver driver;
    WebDriverWait wait;

    public DatePickerPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
