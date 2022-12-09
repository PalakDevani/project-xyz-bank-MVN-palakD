package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {


    By searchCreatedCustomerField = By.xpath("//select[@id='userSelect']");
    By selectCreatedCustomerFromDropDownList = By.xpath("//option[contains(text(),'Hermoine Granger')]");
    By clickOnLogInButton = By.xpath("//button[contains(text(),'Login')]");
    By verifyLogOutTabDisplay = By.xpath("//button[contains(text(),'Logout')]");
    By clickOnLogOutTab = By.xpath("//button[@ng-show='logout']");
    By verifyYourNameTextDisplay = By.xpath("//label[contains(text(),'Your Name :')]");

    public void searchCustomerField() {
        selectByVisibleTextFromDropDown(searchCreatedCustomerField, "Hermoine Granger");
    }

    public void clickOnLogin() {
        clickOnElement(clickOnLogInButton);
    }

    public String verifyLogOutTabDisplay() {
        return getTextFromElement(verifyLogOutTabDisplay);
    }

    public void clickOnLogOut() {
        clickOnElement(clickOnLogOutTab);
    }

    public String verifyYourNameText() {
        return getTextFromElement(verifyYourNameTextDisplay);
    }

}
