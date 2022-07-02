package com.sydeo.step_definitions;

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
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
    }

    @When("user enters track driver username {word}")
    public void userEntersTrackDriverUsername() {
    }

    @And("user enters track driver password {string}")
    public void userEntersTrackDriverPassword(String arg0) {
    }

    @Then("user should see Fleet module")
    public void userShouldSeeFleetModule() {
        System.out.println("Login page appear");
    }

    @Given("user is on the Fleet Management page")
    public void userIsOnTheFleetManagementPage() {
        System.out.println("Login page appear");
    }

    @When("navigate to the Fleet option on top menu")
    public void navigateToTheFleetOptionOnTopMenu() {
        System.out.println("Login page appear");
    }

    @And("navigate to the Vehicle dropdown option")
    public void navigateToTheVehicleDropdownOption() {
        System.out.println("Login page appear");
    }
    @Then("get all Vehicle information grid")
    public void getAllVehicleInformationGrid() {
        System.out.println("Login page appear");
    }
}
