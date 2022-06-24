package Pages.ElementsPage;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class TextBoxPage {
    WebDriver driver;
    WebDriverWait wait;
    WebElement fullNameTextBox;
    WebElement emailFiled;
    WebElement currentAddressTextBox;
    WebElement permanentAddressTextBox;
    WebElement submitButton;
    WebElement fullNameFieldCheck;
    WebElement emailFiledCheck;
    WebElement permanentAddressFiledCheck;
    WebElement currentAddressFiledCheck;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    //getters for elements in page

    public WebElement getFullNameTextBox() {
        return driver.findElement(By.id("userName"));
    }
    public WebElement getEmailFiled() {
        return driver.findElement(By.id("userEmail"));
    }
    public WebElement getCurrentAddressTextBox() {
        return driver.findElement(By.id("currentAddress"));
    }
    public WebElement getPermanentAddressTextBox() {
        return driver.findElement(By.id("permanentAddress"));
    }
    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }
    public WebElement getFullNameFieldCheck() {
        return driver.findElement(By.id("name"));
    }
    public WebElement getEmailFiledCheck() {
        return driver.findElement(By.id("email"));
    }
    public WebElement getPermanentAddressFiledCheck() {
        return driver.findElement(By.id("permanentAddress"));
    }
    public WebElement getCurrentAddressFiledCheck() {
        return driver.findElement(By.id("currentAddress"));
    }

    //------------- methods in textPage

    public void inputTextInFullNameTextBox(String fullName){
        this.getFullNameTextBox().clear();
        this.getFullNameTextBox().sendKeys(fullName);
    }
    public void inputTextInEmailTextBox(String email){
        this.getEmailFiled().clear();
        this.getEmailFiled().sendKeys(email);
    }
    public void inputTextInCurrentAddressTextBox(String currentAddress){
        this.getCurrentAddressTextBox().clear();
        this.getCurrentAddressTextBox().sendKeys(currentAddress);
    }
    public void inputTextInPermanentAddressTextBox(String permanentAddress){
        this.getPermanentAddressTextBox().clear();
        this.getPermanentAddressTextBox().sendKeys(permanentAddress);
    }
    public void clickOnSubmitButton(){
        this.getSubmitButton().click();
    }
}
