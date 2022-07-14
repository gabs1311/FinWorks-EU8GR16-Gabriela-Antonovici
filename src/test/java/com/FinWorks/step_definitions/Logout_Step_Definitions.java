package com.FinWorks.step_definitions;

import com.FinWorks.pages.BasePage;
import com.FinWorks.pages.LoginPage;
import com.FinWorks.pages.LogoutPage;
import com.FinWorks.utilities.ConfigurationReader;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout_Step_Definitions {
    BasePage basePage = new BasePage();
    LogoutPage logoutPage= new LogoutPage();

    @When("user is logged in using   username {string} and password {string} and clicks the loggin button")
    public void user_is_logged_in_using_username_and_password_and_clicks_the_loggin_button(String userName, String password) {

        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

      basePage.inputUserName.sendKeys(userName);
      basePage.inputPassword.sendKeys(password);
      logoutPage.loginButton.click();


    }
    @When("user clicks the dropdown profile menu")
    public void user_clicks_the_dropdown_profile_menu() {
    logoutPage.profileDropdownMenu.click();
    }
    @Then("user clicks the logout button")
    public void user_clicks_the_logout_button() {
    logoutPage.logoutButton.click();
    }


}
