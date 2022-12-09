package com.bank.pages;

import com.bank.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By clickAddCustomerTab = By.xpath("//button[@ng-class ='btnClass1']");
    By clickOpenAccountTab = By.xpath("//button[@ng-class ='btnClass2']");

    public void clickOnAddCustomerTab() {
        clickOnElement(clickAddCustomerTab);

    }

    public void clickOnOpenAccount() {
        clickOnElement(clickOpenAccountTab);
    }

}
