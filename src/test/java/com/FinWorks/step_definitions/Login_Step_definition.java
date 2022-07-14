package com.FinWorks.step_definitions;

import com.FinWorks.pages.BasePage;
import com.FinWorks.pages.LoginPage;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Step_definition extends BasePage {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }

    @When("user enters username {string}")
    public void user_enters_username(String userName) {
        loginPage.inputUserName.sendKeys(userName);
    }

    @When("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.inputPassword.sendKeys(password);
    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        loginPage.loginButton.click();
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();

        // Assert.assertEquals(expectedTitle,actualTitle

        //   String actualName =basePage.inboxCell.getText();

        //   Assert.assertTrue(basePage.inboxCell.isDisplayed());


    }


    @When("user enters invalid  username {string}")
    public void user_enters_invalid_username(String userName) {
        loginPage.inputUserName.sendKeys(userName);
    }

    @When("user enters invalid password {string}")
    public void user_enters_invalid_password(String Password) {
        loginPage.inputPassword.sendKeys(Password);
    }

    @Then("user should not be able to login")
    public void user_should_not_be_able_to_login() {
        String expectedTitle = "Login | Best solution for startups";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }





    @When("user enters incorrect  username {string}")
    public void user_enters_incorrect_username(String incorrectUserName) {
       loginPage.inputUserName.sendKeys(incorrectUserName);
    }
    @When("user enters incorrect password {string}")
    public void user_enters_incorrect_password(String incorrectPassword) {
        loginPage.inputPassword.sendKeys(incorrectPassword);
    }
    @Then("user should get an incorrect credentials  message")
    public void user_should_get_an_incorrect_credentials_message() {
        Assert.assertTrue(loginPage.WrongLoginOrPassErrorMss.isDisplayed());
    }





    @When("user does not enter a username {string}")
    public void user_does_not_enter_a_username(String string) {
        loginPage.inputUserName.sendKeys(string);
    }
    @When("user does not enter a password {string}")
    public void user_does_not_enter_a_password(String string) {
        loginPage.inputPassword.sendKeys(string);
    }
    @Then("user should not be able to login and get a warning message")
    public void user_should_not_be_able_to_login_and_get_a_warning_message() {
        String expectedWarningMessage = "Please fill out this field.";
        String actualMessage1 = loginPage.PleaseFillOutThisFieldMssEmailBox.getAttribute("validationMessage");
        String actualMessage2 = loginPage.PleaseFillOutThisFieldMssPasswordBox.getAttribute("validationMessage");

        Assert.assertEquals(expectedWarningMessage, actualMessage1);
        Assert.assertEquals(expectedWarningMessage,actualMessage2);


    }
}
