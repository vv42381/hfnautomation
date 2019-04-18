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
import pages.InspirePage;
import pages.DiscoverPage;

public class DiscoverPageSteps extends BaseStep {
	public AppiumDriver driver = AppiumDriverUtil.getDriver();
	
	DiscoverPage DiscoverPage = new DiscoverPage(driver);
        
    @When("user clicks on know more")
    public void user_clicks_on_know_more() throws Throwable {

    	DiscoverPage.clickKnowMore();
    }


}