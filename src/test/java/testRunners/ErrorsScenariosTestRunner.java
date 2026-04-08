package testRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/", glue = "steps_definitions",
monochrome = true, tags = "@errorsvalidations", plugin = {"html:target/cucumber.html"})
public class ErrorsScenariosTestRunner extends AbstractTestNGCucumberTests {

}
