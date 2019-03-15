package steps;

import base.AppiumDriverUtil;
import base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import org.testng.AssertJUnit;

import pages.SigninPage;

public class SigninPageSteps extends BaseStep {
	public AppiumDriver driver = AppiumDriverUtil.getDriver();
	
	SigninPage SigninPage = new SigninPage(driver);
	
    @Given("^user open heartsapp$")
    public void userOpensCalc() throws Throwable {
        AssertJUnit.assertTrue("Application is not open", SigninPage.isOpen());
    }
    
    @When("user clicks on signin")
    public void user_clicks_on_signin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        SigninPage.clickSignInBtn();
    }
    
}