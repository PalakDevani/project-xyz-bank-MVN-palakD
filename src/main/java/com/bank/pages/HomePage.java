package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {


    By clickOnHome = By.linkText("Home");
    By clickOnCustomerLoginTab = By.xpath("//button[contains(text(),'Customer Login')]");
    By clickOnBankManagerLoginTab = By.xpath("//button[contains(text(),'Bank Manager Login')]");


    public void clickOnHomeTab() {
        clickOnElement(clickOnHome);
    }

    public void clickOnCustomerLoginTab() {

        clickOnElement(clickOnCustomerLoginTab);
    }

    public void clickOnBankManagerLoginTab() {

        clickOnElement(clickOnBankManagerLoginTab);
    }
}
