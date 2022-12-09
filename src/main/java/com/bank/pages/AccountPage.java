package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By clickOnDepositeTopTab = By.xpath("//div[@ng-hide='noAccount']//button[2]");
    By enterAmountField = By.xpath("//input[@placeholder='amount']");
    By clickOnDepositeAfterAmountField = By.xpath("//button[@type='submit']");
    By verifyMessage = By.xpath("//span[contains(text(),'Deposit Successful')]");

    By clickOnWithdrawTopTab = By.xpath("//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]");

    public void clickOnDepositeTab() {
        clickOnElement(clickOnDepositeTopTab);
    }

    public void enter100InAmountField() {
        sendTextToElement(enterAmountField, "100");
    }

    public void clickOnDepositeButton() {
        clickOnElement(clickOnDepositeAfterAmountField);
    }

    public void ClickOnWithdrawTab() {
        clickOnElement(clickOnWithdrawTopTab);
    }

    By amountWithdraw = By.tagName("input");

    public void enterAmountInWithdrawField() {
        sendTextToElement(amountWithdraw, "50");
    }

    By clickOnWithdrawBtn = By.linkText("Withdraw");

    public void clickOnWithdrawButton() {
        clickOnElement(clickOnWithdrawBtn);
    }

    By verifyMessageTransactionSuccessful = By.xpath("//span[contains(text(),'Transaction successful')]");

    public String verifyMsgTransactionSuccessful() {
        return getTextFromElement(verifyMessageTransactionSuccessful);
    }


}
