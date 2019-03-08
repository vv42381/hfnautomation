package Runner;

import com.vimalselvam.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import java.io.File;

/**
* Cucumber test runner
*/
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/resources/Features",
glue = {"steps", "hooks"},
tags = {"@smoke"},
plugin = {"pretty", "html:target/cucumber", "junit:target/cucumber/cukes.xml"})

public class TestRunner extends AbstractTestNGCucumberTests{

    @org.testng.annotations.AfterClass
    public static void teardown() {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("sample test");
    }

}

