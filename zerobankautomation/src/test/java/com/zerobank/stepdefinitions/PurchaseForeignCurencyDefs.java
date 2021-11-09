package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PurchaseForeignCurencyDefs {

    AccountActivityPage accountActivityPage = new AccountActivityPage();
    @Given("the user accesses the Purchase foreign currency cash tab")
    public void theUserAccessesThePurchaseForeignCurrencyCashTab() {

        accountActivityPage.payBills.click();
        BrowserUtils.waitFor(1);
        accountActivityPage.purchaseForeignCurrency.click();
        BrowserUtils.waitFor(1);




    }


    @Then("following currencies should be available")
    public void followingCurrenciesShouldBeAvailable(List<String> expectedElements) {

        List<String> actualElements = BrowserUtils.getElementsText(accountActivityPage.currency);
        System.out.println("expectedElements = " + expectedElements);
        System.out.println("actualElements = " + actualElements);

        Assert.assertEquals(expectedElements,actualElements);



    }
}
