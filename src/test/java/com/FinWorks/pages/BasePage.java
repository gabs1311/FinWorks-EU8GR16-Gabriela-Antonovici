package com.FinWorks.pages;

import com.FinWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    // elements that are commnon to all classes

    public BasePage(){
PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//input[@name='login']")
    public WebElement inputUserName;

    @FindBy(id ="password")

    public WebElement inputPassword;

    @FindBy(xpath = "//span[@class='o_channel_name']")
    public WebElement inboxCell;

}
