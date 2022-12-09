package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    AccountPage accountPage = new AccountPage();

    @Test

    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginTab();
        Thread.sleep(5000);
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Hermoine");
        addCustomerPage.enterLastName("Granger");
        addCustomerPage.enterPostcode("AB1 2CD");
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.popupDisplay();
        addCustomerPage.verifyMessageInPopupWindow();
        addCustomerPage.switchToAcceptAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.selectCustomerCreatedFromDropDownList();
        openAccountPage.selectCurrencyFromDropDownList();
        openAccountPage.clickOnProcessButton();
        addCustomerPage.popupDisplay();
        addCustomerPage.verifyMessageInPopupWindow();
        addCustomerPage.clickOnOkButtInPopup();
    }

    @Test
    public void customerShouldLoginAndLogOutSuccessfully() {

        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchCustomerField();
        customerLoginPage.clickOnLogin();
        customerLoginPage.verifyLogOutTabDisplay();
        customerLoginPage.clickOnLogOut();
        customerLoginPage.verifyYourNameText();
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchCustomerField();
        customerLoginPage.clickOnLogin();
        accountPage.clickOnDepositeTab();
        accountPage.enter100InAmountField();
        accountPage.clickOnDepositeButton();
        addCustomerPage.popupDisplay();
        addCustomerPage.verifyMessageInPopupWindow();
        addCustomerPage.clickOnOkButtInPopup();
    }

    @Test

    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchCustomerField();
        customerLoginPage.clickOnLogin();
        accountPage.ClickOnWithdrawTab();
        accountPage.enterAmountInWithdrawField();
        accountPage.verifyMsgTransactionSuccessful();


    }

}


