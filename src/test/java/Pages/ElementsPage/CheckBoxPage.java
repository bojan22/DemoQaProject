package Pages.ElementsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.util.*;

public class CheckBoxPage {
    WebDriver driver;
    WebDriverWait wait;
    WebElement homeCheckBox;
    WebElement documentsCheckBox;
    WebElement expandPlusButton;


    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    // getters
    public WebElement getHomeCheckBox() {
        return driver.findElement(By.className("rct-checkbox"));
    }
    public WebElement getResultFiledCheckBox(){
        return driver.findElement(By.id("result"));
    }

    public WebElement getDocumentsCheckBox() {
        return driver.findElement(By.linkText("Documents"));
    }

    public WebElement getExpandPlusButton() {
        return driver.findElement(By.cssSelector(".rct-icon.rct-icon-expand-all"));
    }




    //------- methods

    public void clickOnHomeCheckBox(){
        this.getHomeCheckBox().click();
    }
    public void clickOnExpandPlusButton(){
        this.getExpandPlusButton().click();
    }





}
