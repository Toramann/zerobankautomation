package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

        @Given("the user is on the login page")
        public void the_user_is_on_the_login_page () {
            String url = ConfigurationReader.get("url");
            Driver.get().get(url);

        }

        @When("the user enters the User information")
        public void the_user_enters_the_User_information () {
            String username = ConfigurationReader.get("username");
            String password = ConfigurationReader.get("password");

            LoginPage loginPage = new LoginPage();

            loginPage.login(username, password);
            loginPage.SecureDetails.click();
            loginPage.SecureSubmit.click();

        }

        @Then("the user should be able to login")
        public void the_user_should_be_able_to_login () {

            String actualTitle = Driver.get().getTitle();

            Assert.assertEquals("Zero - Account Summary", actualTitle);

        }

        @Given("the user is logged in")
        public void theUserIsLoggedIn () {

            LoginPage loginPage = new LoginPage();
            String url = ConfigurationReader.get("url");
            Driver.get().get(url);
            String username = ConfigurationReader.get("username");
            String password = ConfigurationReader.get("password");
            loginPage.login(username, password);
            loginPage.SecureDetails.click();
            loginPage.SecureSubmit.click();
        }

    }
