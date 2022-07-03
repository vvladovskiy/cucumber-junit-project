package com.sydeo.step_definitions;

import com.sydeo.utilities.ConfigurationReader;
import com.sydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FleetModule {

    //FleetModulePage fleetModulePage = new FleetModulePage();
    @Given("user is on the Vytrack login page")
    public void userIsOnTheVytrackLoginPage() {
        System.out.println("Login page appear");
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters track driver un {string}")
    public void userEntersTrackDriverUn(String string) {
        System.out.println("Enter username");
        Driver.getDriver().get(ConfigurationReader.getProperty("username"));
    }

    @And("user enters track driver pwd {string}")
    public void userEntersTrackDriverPwd(String string) {
        System.out.println("Enter password");
        Driver.getDriver().get(ConfigurationReader.getProperty("password"));
    }

    @Then("user should see Fleet module")
    public void userShouldSeeFleetModule() {
        System.out.println("Click SignIn Button");
    }



    @Given("user is on the Fleet Management page")
    public void userIsOnTheFleetManagementPage() {
        System.out.println("Fleet Management page appear");
    }

    @When("navigate to the Fleet option on top menu")
    public void navigateToTheFleetOptionOnTopMenu() {
        System.out.println("Navigate Fleet option menu");
    }

    @And("navigate to the Vehicle dropdown option")
    public void navigateToTheVehicleDropdownOption() {
        System.out.println("Navigate Vehicle dropdown menu");
    }
    @Then("get all Vehicle information grid")
    public void getAllVehicleInformationGrid() {
        System.out.println("Click any car to get info");
    }





}
