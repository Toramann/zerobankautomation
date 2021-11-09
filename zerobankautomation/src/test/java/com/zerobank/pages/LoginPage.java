package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public LoginPage(){
    PageFactory.initElements(Driver.get(),this);
}

@FindBy(id = "signin_button")
    public WebElement signButton;

@FindBy(id = "user_login")
    public WebElement loginSection;

@FindBy(id ="user_password" )
    public  WebElement passwordSection;

@FindBy(name = "submit")
    public WebElement SignIn;

@FindBy(id = "details-button")
    public WebElement SecureDetails;

    @FindBy(id = "proceed-link")
    public WebElement SecureSubmit;

public void login(String username,String password){

        signButton.click();
        loginSection.sendKeys(username);
        passwordSection.sendKeys(password);
        SignIn.click();


}
}
