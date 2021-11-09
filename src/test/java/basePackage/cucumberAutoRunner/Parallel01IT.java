package basePackage.cucumberAutoRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"/Users/himanshuaggarwal/Documents/AutomationRepos/Autumn-Demo-Cucumber/src/test/java/systemTesting/CrateUser.feature:15"},
        plugin = {"json:/Users/himanshuaggarwal/Documents/AutomationRepos/Autumn-Demo-Cucumber/target/cucumber-parallel/1.json", "html:/Users/himanshuaggarwal/Documents/AutomationRepos/Autumn-Demo-Cucumber/target/cucumber-parallel/1"},
        monochrome = false,
        glue = {"com.autumnImp.demo", "com.autumn", "basePackage"})
public class Parallel01IT extends AbstractTestNGCucumberTests {
}
