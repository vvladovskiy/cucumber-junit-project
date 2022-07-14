package com.sydeo.pages;

import com.sydeo.utilities.DriverPT;
import org.openqa.selenium.support.PageFactory;

public class FleetModulePage {
    public FleetModulePage() {
        PageFactory.initElements(DriverPT.getDriver(), this);
    }


}
