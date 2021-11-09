package basePackage.cucumberAutoRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"/Users/himanshuaggarwal/Documents/AutomationRepos/Autumn-Demo-Cucumber/src/test/java/systemTesting/GetUsers.feature:12"},
        plugin = {"json:/Users/himanshuaggarwal/Documents/AutomationRepos/Autumn-Demo-Cucumber/target/cucumber-parallel/2.json", "html:/Users/himanshuaggarwal/Documents/AutomationRepos/Autumn-Demo-Cucumber/target/cucumber-parallel/2"},
        monochrome = false,
        glue = {"com.autumnImp.demo", "com.autumn", "basePackage"})
public class Parallel02IT extends AbstractTestNGCucumberTests {
}
