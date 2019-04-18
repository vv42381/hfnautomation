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
import pages.ExplorePage;

public class ExplorePageSteps extends BaseStep {
	public AppiumDriver driver = AppiumDriverUtil.getDriver();
	
	ExplorePage ExplorePage = new ExplorePage(driver);
        
    @When("user clicks on view more")
    public void user_clicks_on_view_more() throws Throwable {

    	ExplorePage.clickViewMore();
    }


}