package com.FinWorks.pages;

import com.FinWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BasePage{

    public LogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Log in']")

    public WebElement loginButton;

    @FindBy(className = "oe_topbar_name")
    public WebElement topbarDropdown;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutButton;





}
