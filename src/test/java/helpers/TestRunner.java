package helpers;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        tags = {"@TC001,@TC002"},
        glue = {""},
        plugin = {"pretty","json:target/cucumber.json","html:target/report"},
        monochrome = true
)

public class TestRunner {

}