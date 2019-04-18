package steps;

import base.AppiumDriverUtil;
import base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import org.testng.AssertJUnit;

import pages.LoginPage;
import pages.MeditateHomePage;
import pages.SigninPage;

public class UtilSteps extends BaseStep {
    
    @When("user swipes (.*)")
    public void user_swipes(String text) throws Throwable {
    	AppiumDriverUtil.swipe(text, 1000);
    }

    @When("user clicks back")
    public void user_clicks_back() throws Throwable {
    	AppiumDriverUtil.goBack();
    	Thread.sleep(3000);
    }

}