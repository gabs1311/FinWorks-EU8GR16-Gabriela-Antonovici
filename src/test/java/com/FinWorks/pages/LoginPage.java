package com.FinWorks.pages;

import com.FinWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }




    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;


   @FindBy(xpath = "nav[@id='oe_main_menu_navbar']")
    public WebElement navigationBar;


    @FindBy(xpath = "//p[@class='alert alert-danger']")
   public WebElement WrongLoginOrPassErrorMss;



    @FindBy(name = "login")
    public WebElement PleaseFillOutThisFieldMssEmailBox;

    @FindBy(name = "password")
    public WebElement PleaseFillOutThisFieldMssPasswordBox;



}
