package com.sydeo.step_definitions;

import com.sydeo.pages.VytrackLoginPage;
import com.sydeo.utilities.ConfigurationReader;
import com.sydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FleetModule {

    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    @Given("user is on the vytrack login page")
    public void user_is_on_the_vytrack_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user enters track driver un {string}")
    public void user_enters_track_driver_un(String string) {
        vytrackLoginPage.username.sendKeys(string);
    }

    @When("user enters track driver pwd {string}")
    public void user_enters_track_driver_pwd(String string) {
        vytrackLoginPage.password.sendKeys(string);
    }

    @And("user click SignIn button")
    public void userClickSignInButton() {
        vytrackLoginPage.signInBtn.click();
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
