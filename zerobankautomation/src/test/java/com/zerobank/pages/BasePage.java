package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

@FindBy(css = "//*[text()='Savings']")
    public WebElement Savings;

@FindBy(css = "//*[text()='Brokerage']")
    public  WebElement Brokerage;

@FindBy(css = "//*[text()='Checking']")
    public  WebElement Checking;

@FindBy(css = "//*[text()='Credit Card']")
    public  WebElement CreditCard;
@FindBy(css = "//*[text()='Loan']")
    public  WebElement Loan;

}
