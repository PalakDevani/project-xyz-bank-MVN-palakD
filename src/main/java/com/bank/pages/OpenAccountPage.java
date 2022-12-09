package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By selectCustomerCreated = By.id("userSelect");
    By selectCurrency = By.id("currency");
    By clickOnProcessBtn = By.xpath("//button[contains(text(),'Process')]");

    public void selectCustomerCreatedFromDropDownList() {
        selectByVisibleTextFromDropDown(selectCustomerCreated, "Hermoine Granger");
    }

    public void selectCurrencyFromDropDownList() {
        selectByVisibleTextFromDropDown(selectCurrency, "Pound");
    }

    public void clickOnProcessButton() {
        clickOnElement(clickOnProcessBtn);
    }

}
