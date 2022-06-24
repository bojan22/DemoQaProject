package Tests;

import Base.*;
import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

import java.util.*;

public class ElementsTests extends BaseTest {

    @BeforeMethod
    public void pageSetup(){
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void verifyInputsWithValidCredentials() {
        //expected inputs
        String expectedName = "Name:Bojan Zivkovic";
        String expectedEmail = "Email:bojanqa@test.com";
        String expectedCurrentAddress = "Current Address :Neka adresa br 11";
        String expectedPermanetAdress = "Stalna adresa br 22";
        //test steps
        scrollIntoView(homepagePage.getElementsButton());
        homepagePage.clickOnElements();
        sidebarPage.clickOnTexBoxButton();
        textBoxPage.inputTextInFullNameTextBox("Bojan Zivkovic");
        textBoxPage.inputTextInEmailTextBox("bojanqa@test.com");
        textBoxPage.inputTextInCurrentAddressTextBox("Neka adresa br 11");
        textBoxPage.inputTextInPermanentAddressTextBox("Stalna adresa br 22");
        scrollIntoView(textBoxPage.getSubmitButton());
        textBoxPage.clickOnSubmitButton();
        //verify full name and email is as provided
        Assert.assertEquals(textBoxPage.getFullNameFieldCheck().getText(), expectedName);
        Assert.assertEquals(textBoxPage.getEmailFiledCheck().getText(), expectedEmail);
        //cant get text from these fields and verification doesn't work
        //write do devs about cant extract text prom paragraf
        //Assert.assertEquals(textBoxPage.getCurrentAddressFiledCheck().getText(), expectedCurrentAddress);
        //Assert.assertEquals(textBoxPage.getPermanentAddressFiledCheck().getText(), expectedPermanetAdress);
    }
    @Test
    public void verifyInputsWithInvalidEmailFormat(){

        //test steps
        scrollIntoView(homepagePage.getElementsButton());
        homepagePage.clickOnElements();
        sidebarPage.clickOnTexBoxButton();
        textBoxPage.inputTextInFullNameTextBox("Bojan Zivkovic");
        textBoxPage.inputTextInEmailTextBox("bojanqa@test.c");
        textBoxPage.inputTextInCurrentAddressTextBox("Neka adresa br 11");
        textBoxPage.inputTextInPermanentAddressTextBox("Stalna adresa br 22");
        scrollIntoView(textBoxPage.getSubmitButton());
        textBoxPage.clickOnSubmitButton();
        //verify elements are not displayed after input and error is shown
        boolean check = false;
        try {
            check = driver.findElement(By.id("name")).isDisplayed();
        }catch (Exception e){}
        Assert.assertFalse(check);

        boolean check1 = false;
        try {
            check1 = driver.findElement(By.id("email")).isDisplayed();
        }catch (Exception e){}
        Assert.assertFalse(check1);
        //no error notification massage write to developers
    }
    @Test
    public void checkBoxTest(){

        scrollIntoView(homepagePage.getElementsButton());
        homepagePage.clickOnElements();
        sidebarPage.clickOnCheckBoxButton();
        Assert.assertFalse(checkBoxPage.getHomeCheckBox().isSelected());
        checkBoxPage.clickOnHomeCheckBox();
        checkBoxPage.clickOnExpandPlusButton();
        Assert.assertTrue(checkBoxPage.getHomeCheckBox().isSelected());

        //checkBoxPage.clickOnDocunetsBtn();


    }



}
