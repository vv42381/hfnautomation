package steps;

import base.AppiumDriverUtil;
import base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import org.testng.AssertJUnit;

import pages.IntrospectPage;
import pages.LoginPage;
import pages.MeditateHomePage;
import pages.SigninPage;

public class IntrospectPageSteps extends BaseStep {
	public AppiumDriver driver = AppiumDriverUtil.getDriver();
	
	IntrospectPage IntrospectPage = new IntrospectPage(driver);
        
    @When("user clicks on make note")
    public void user_clicks_on_make_note() throws Throwable {

    	IntrospectPage.clickMakeNote();
    }


}