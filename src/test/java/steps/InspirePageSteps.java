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

public class InspirePageSteps extends BaseStep {
	public AppiumDriver driver = AppiumDriverUtil.getDriver();
	
	InspirePage InspirePage = new InspirePage(driver);
        
    @When("user clicks on be inspired")
    public void user_clicks_on_be_inspired() throws Throwable {

    	InspirePage.clickBeInspired();
    }


}