package steps;

import base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.AssertJUnit;

import pages.LoginPage;
import pages.MeditateHomePage;
import pages.ProfilePage;

public class ProfilePageSteps extends BaseStep {
    
    @When("user clicks on subscription")
    public void user_clicks_on_subscription() throws Throwable {

    	ProfilePage.clickSubscription();
    }


}