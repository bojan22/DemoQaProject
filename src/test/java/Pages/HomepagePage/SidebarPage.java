package Pages.HomepagePage;
import Base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

public class SidebarPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    WebElement textBoxButton;
    WebElement checkBoxButton;

    public SidebarPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    // getters

    public WebElement getTextBoxButton() {
        return driver.findElement(By.id("item-0"));
    }
    public WebElement getCheckBoxButton() {
        return driver.findElement(By.id("item-1"));
    }


    //-----methods

    public void clickOnTexBoxButton(){
        this.getTextBoxButton().click();
    }
    public void clickOnCheckBoxButton(){
        this.getCheckBoxButton().click();
    }


}
