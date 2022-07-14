package com.sydeo.step_definitions;

import com.sydeo.pages.VytrackLoginPage;
import com.sydeo.utilities.ConfigurationReader;
import com.sydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class LoginVariants {
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
    @Then("user is on the Vehicles page")
    public void userIsOnTheVehiclesPage(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(titleIs("Car - Entities - System - Car - Entities - System"));
    }

}
