package Pages.HomepagePage;

import Base.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;

import java.awt.*;
import java.util.List;

public class HomepagePage extends BaseTest {

    WebElement elementsButton;



    public HomepagePage() {
        PageFactory.initElements(driver, this);

    }

    public @FindBy (className = "card-body")
    List<WebElement> cards;
//    public @FindBy (className = "text-success")
//    List<WebElement> checkBox;

    public void clickOnElements(){
        for (int i=0; i< cards.size();i++){
            if(cards.get(i).getText().equals("Elements"))
            {cards.get(i).click();
                break;}
        }
    }

//    public String getTextFromCheckBoxFiled(){
//        for (int i = 0; i< checkBox.size(); i++){
//            String text = checkBox.get(i).getText();
//            return text;
//        }

    public WebElement getElementsButton() {
        return driver.findElement(By.className("card-body"));
    }
}
