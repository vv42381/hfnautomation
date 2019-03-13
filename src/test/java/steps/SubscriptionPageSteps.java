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
import pages.SubscriptionPage;

public class SubscriptionPageSteps extends BaseStep {
    
    @When("user clicks on upgrade")
    public void user_clicks_on_upgrade() throws Throwable {

    	SubscriptionPage.clickUpgrade();
    }
    
    @When("user clicks on proceed")
    public void user_clicks_on_proceed() throws Throwable {

    	SubscriptionPage.clickProceed();
    }
    
    @When("user clicks on credit card")
    public void user_clicks_on_credi_card() throws Throwable {

    	SubscriptionPage.clickCreditCard();
    }


}