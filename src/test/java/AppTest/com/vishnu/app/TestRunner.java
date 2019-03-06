package AppTest.com.vishnu.app;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/resources/open.feature",
glue = "stepDefinitions",
plugin = {"pretty", "html:target/cucumber", "junit:target/cucumber/cukes.xml"})

public class TestRunner extends AbstractTestNGCucumberTests{



}
