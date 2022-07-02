package com.sydeo.pages;

import com.sydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {
    public VytrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='prependedInput']")
    WebElement username;

    @FindBy(xpath = "//*[@id='prependedInput2']")
    WebElement password;

    @FindBy(xpath = "//*[@id='_submit']")
    WebElement signinbutton;

    @FindBy(xpath = "//*[@id='login-form']/fieldset/div[1]/div")
    WebElement checkerrormsg;



    //Driver.closeDriver();
}


