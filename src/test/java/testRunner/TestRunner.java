package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       // features = "src/test/resources/features",
      features= "C:/Users/Admin/IdeaProjects/selenium_Cucum_Framework/src/test/resources/features/OrangeHRM.feature",
        glue = "stepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-report.json"
        },
        monochrome = true
)
public class TestRunner {
}
