package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = { "capstone.feature" }, glue = {
"StepDefinitions" }, plugin = { "pretty", "html:capstonetestreport.html" })

public class CapstoneTestRunner extends AbstractTestNGCucumberTests {

}
