package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"steps"},
        plugin = {
                "pretty",  // Console output
                "html:target/cucumber-reports/cucumber.html",  // HTML report
                "json:target/cucumber-reports/cucumber.json"   // JSON report (for further processing)
        },
        dryRun = false,
        monochrome = true,
        tags = "@login or @demo or @add"
        //name = {"Logo"}
)
public class TestRunner {

}