package com.FinWorks.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                //  "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/jsonReports/cucumber-reports.json"
        },





        features = "src/test/resources/features",
        glue="com/FinWorks/step_definitions",
        dryRun= true,
        tags = "@wip",
        publish = true





        )
public class CukesRunner {
}
