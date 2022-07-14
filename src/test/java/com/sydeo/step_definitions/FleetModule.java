package com.sydeo.step_definitions;

import com.sydeo.pages.FleetModulePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.sydeo.utilities.BrowserUtils.verifyTitle2;
import static org.junit.Assert.assertEquals;

public class FleetModule {

    FleetModulePage fleetModulePage = new FleetModulePage();



    @Then("user should see fleet module page")
    public void user_should_see_fleet_module_page() {
         verifyTitle2("Dashboard");
    }




//    @Then("user should see fleet module")
//    public void user_should_see_fleet_module() {
//Assert.assertTrue(vytrackLoginPage.checkErrorMsg.isDisplayed());
//    }


    @Given("user is on the fleet management page")
    public void user_is_on_the_fleet_management_page() {

    }

    @When("navigate to the fleet option on top menu")
    public void navigate_to_the_fleet_option_on_top_menu() {

    }

    @When("navigate to the vehicle dropdown option")
    public void navigate_to_the_vehicle_dropdown_option() {

    }

    @Then("get all vehicle information grid")
    public void get_all_vehicle_information_grid() {

    }
}

