package com.sydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
        "html:target/cucumber-report.html",
        "rerun:target/rerun.txt" ,
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
},
        features = "src/test/resources/features" ,
        glue = "com/cydeo/step_definitions" ,
        dryRun = false,
        tags ="@driven1 and @driven2"
)
public class CukesRunner {
}
