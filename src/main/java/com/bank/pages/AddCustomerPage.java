package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By enterFirstName = By.xpath("//input [@placeholder=\"First Name\"]");
    By enterLastName = By.xpath("//input [@placeholder=\"Last Name\"]");
    By enterPostCode = By.xpath("//input [@placeholder=\"Post Code\"]");

    By clickOnAddCustomerButton = By.xpath("//button[@type='submit']");


    public void enterFirstName(String firstName) {
        sendTextToElement(enterFirstName, firstName);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(enterLastName, lastName);
    }

    public void enterPostcode(String postcode) {
        sendTextToElement(enterPostCode, postcode);
    }

    public void clickOnAddCustomerButton() {
        clickOnElement(clickOnAddCustomerButton);
    }

    // verify the message in popup Alert
    public String verifyMessageInPopupWindow() {
        return getTextFromAlert();

    }

    //	popup display
    public void popupDisplay() {
        switchToAlert();
    }

    public void clickOnOkButtInPopup() {
        switchToAcceptAlert();
    }

}
