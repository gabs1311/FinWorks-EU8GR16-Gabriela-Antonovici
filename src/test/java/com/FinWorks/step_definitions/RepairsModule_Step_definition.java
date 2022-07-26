package com.FinWorks.step_definitions;

import com.FinWorks.pages.LoginPage;
import com.FinWorks.pages.RepairsModulePage;
import com.FinWorks.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RepairsModule_Step_definition extends LoginPage {
        RepairsModulePage repairsModulePage = new RepairsModulePage();
        LoginPage loginPage= new LoginPage();
    @Then("user clicks the Repair Module")
    public void user_clicks_the_repair_module() {
        RepairsModulePage.RepairsModuleButton.click();
    }

    @When("user is on the Repair Orders Page")
    public void userIsOnTheRepairOrdersPage() {
       String expectedText = "Repair Orders";
        String actualText = RepairsModulePage.RepairOrdersTitle.getText();
       // String expectedTitle = "Repair Orders";
      //  String actualTitle = Driver.getDriver().getTitle();

    }

    @And("user clicks on a repair reference")
    public void userClicksOnARepairReference() {
        RepairsModulePage.RepairsModuleButton.click();
    }

    @Then("the repair order reference oppens")
    public void theRepairOrderReferenceOppens() {

        String ExpectedText = "";
        String actualText = RepairsModulePage.RepairReference.getText();
    }
}
