package com.sydeo.step_definitions;

import com.sydeo.pages.VytrackLoginPage;
import com.sydeo.utilities.BrowserUtils;
import com.sydeo.utilities.ConfigurationReader;
import com.sydeo.utilities.Driver;
import com.sydeo.utilities.DriverPT;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class LoginVariants {
    VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();

    @Given("user is on the vytrack login page")
    public void user_is_on_the_vytrack_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    /** Hardcoded*/
    @When("user enters track driver username")
    public void userEntersTrackDriverUsername() {
        vytrackLoginPage.username.sendKeys("user4");
    }
    @And("user enters track driver password")
    public void userEntersTrackDriverPassword() {
        vytrackLoginPage.password.sendKeys("UserUser123");
    }

    /** Configuration.properties*/
    @When("user enters track driver username.conf.prop")
    public void userEntersTrackDriverUsernameConfProp() {
        DriverPT.getDriver().get(ConfigurationReader.getProperty("username"));
    }
    @And("user enters track driver password.conf.prop")
    public void userEntersTrackDriverPasswordConfProp() {
        DriverPT.getDriver().get(ConfigurationReader.getProperty("password"));
    }

    /** Parameterization*/
    @When("user enters track driver username {string}")
    public void user_enters_track_driver_un(String string) {
        vytrackLoginPage.username.sendKeys(string);
    }
    @When("user enters track driver password {string}")
    public void user_enters_track_driver_pwd(String string) {
        vytrackLoginPage.password.sendKeys(string);
    }

    
    /** DataTable*/
    @When("user enters track driver username.dt {string}")
    public void userEntersTrackDriverUsernameDt(String arg0) {vytrackLoginPage.username.sendKeys(arg0);
    }
    @And("user enters track driver password.dt {string}")
    public void userEntersTrackDriverPasswordDt(String arg0) {vytrackLoginPage.password.sendKeys(arg0);
    }

    /** DataTable2*/
    @When("user enters track driver credentials below")
    public void userEntersTrackDriverCredentialsBelow(Map<String,String> credentials) {vytrackLoginPage.login(credentials.get("username"),credentials.get("password"));
    }



    @And("user check mark field Remember me on this computer")
    public void userCheckMarkFieldRememberMeOnThisComputer() {
        vytrackLoginPage.remember_me.click();
    }

    @And("user click SignIn button")
    public void userClickSignInButton() {
        vytrackLoginPage.signInBtn.click();
    }

    @Then("user is on the Vehicles page")
    public void userIsOnTheVehiclesPage() {
        BrowserUtils.verifyTitle3("Car - Entities - System - Car - Entities - System");
    }

    /** ScenarioOutline*/
    @When("user enters track driver username.so {string}")
    public void userEntersTrackDriverUsernameSo(String username) {
        vytrackLoginPage.username.sendKeys(username);
    }
    @And("user enters track driver password.so {string}")
    public void userEntersTrackDriverPasswordSo(String password) {
        vytrackLoginPage.password.sendKeys(password);
    }




}
