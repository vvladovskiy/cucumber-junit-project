package com.sydeo.pages;

import com.sydeo.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testToRemove {


    public class LibraryLoginPage {


        public void Login() {

            PageFactory.initElements(Driver.getDriver(), this);

        }


        @FindBy(id = "inputEmail")

        public String inputEmail;
    }
}
