package com.FinWorks.step_definitions;

import com.FinWorks.pages.BasePage;
import com.FinWorks.pages.LoginPage;
import com.FinWorks.pages.LogoutPage;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout_Step_Definitions {
    BasePage basePage = new BasePage();
    LogoutPage logoutPage= new LogoutPage();
    LoginPage loginPage= new LoginPage();


    @Given("user enters username {string} password {string}")
    public void user_enters_username_password(String userName, String password) {

        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

        loginPage.inputUserName.sendKeys("salesmanager15@info.com");
        loginPage.inputPassword.sendKeys("salesmanager");
    }
    @When("user  clicks the loggin button")
    public void user_clicks_the_loggin_button() {
        loginPage.loginButton.click();

    }
    @When("user is logged in")
    public void user_is_logged_in() {

        String expectedTitle = "Odoo";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);


    }
    @When("user clicks the dropdown profile menu")
    public void user_clicks_the_dropdown_profile_menu() {
        logoutPage.topbarDropdown.click();
        logoutPage.logoutButton.click();
    }
    @When("user clicks the logout button")
    public void user_clicks_the_logout_button() {
        String expectedTitle= "Login | Best solution for startups";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("user returns to the login page")
    public void user_returns_to_the_login_page() {

    }



}
