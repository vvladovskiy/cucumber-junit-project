package com.sydeo.pages;

import com.sydeo.utilities.DriverPT;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    // Initializing the Page Objects:
    public VytrackLoginPage() {
        PageFactory.initElements(DriverPT.getDriver(), this);
    }


    // Page Factory
    @FindBy(xpath = "//*[@id='prependedInput']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='prependedInput2']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='login-form']/fieldset/div[2]/label/span[1]")
    public WebElement remember_me;

    @FindBy(xpath = "//*[@id='_submit']")
    public WebElement signInBtn;


    //@FindBy(xpath = "//*[@id='login-form']/fieldset/div[1]/div")
    //public WebElement checkErrorMsg;


// Actions
    public String validateLoginPageTitle(String str) {
        return DriverPT.getDriver().getTitle();
    }

//public boolean validateErrorMessage(){
    //return checkErrorMsg.isDisplayed();
//}

    public VytrackLoginPage login(String un, String pwd) {

        username.sendKeys(un);
        password.sendKeys(pwd);
        signInBtn.click();

        JavascriptExecutor js = (JavascriptExecutor) DriverPT.getDriver();
        js.executeScript("argument[0].click();", signInBtn);
        return new VytrackLoginPage();
    }

    //Driver.closeDriver();
}


