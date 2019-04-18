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

public class MeditateHomePageSteps extends BaseStep {
	public AppiumDriver driver = AppiumDriverUtil.getDriver();
	
	MeditateHomePage MeditateHomePage = new MeditateHomePage(driver);
        
    
    @When("user clicks on profile image")
    public void user_clicks_on_profile_image() throws Throwable {

    	MeditateHomePage.clickProfileImage();
    }


}