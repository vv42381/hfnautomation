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
import pages.ProfilePage;
import pages.SigninPage;

public class ProfilePageSteps extends BaseStep {
	public AppiumDriver driver = AppiumDriverUtil.getDriver();
	
	ProfilePage ProfilePage = new ProfilePage(driver);
    
    @When("user clicks on subscription")
    public void user_clicks_on_subscription() throws Throwable {

    	ProfilePage.clickSubscription();
    }


}