package com.FinWorks.pages;

import com.FinWorks.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepairsModulePage extends LoginPage {

    public RepairsModulePage(){

        PageFactory.initElements(Driver.getDriver(), this); }

        @FindBy (xpath = "//span[@class='oe_menu_text']")
        public static WebElement RepairsModuleButton;



        @FindBy(xpath = "//ol[@class = 'breadcrumb']")
    public static WebElement RepairOrdersTitle;

        @FindBy (xpath = "//td[@class = 'o_data_cell o_required_modifier']")
    public static WebElement RepairReference;


}
