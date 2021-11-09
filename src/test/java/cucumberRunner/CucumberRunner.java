package cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"src/test/java/systemTesting"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = {"@dataProtection", "~@disabled"},
        monochrome = true,
        glue = {"com.autumnImp.demo", "com.autumn","basePackage"})
public class CucumberRunner extends AbstractTestNGCucumberTests {
    //CreateUser.feature:15
}