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

public class LoginPageSteps extends BaseStep {
	public AppiumDriver driver = AppiumDriverUtil.getDriver();
	
	LoginPage LoginPage = new LoginPage(driver);
    
    @When("user clicks on accept policy")
    public void user_clicks_on_accept_policy() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	LoginPage.clickCheckboxPolicy();
    }

    @When("user clicks on Email")
    public void user_clicks_on_Email() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	LoginPage.clickSignInEmail();
    }

    @When("user enters email (.*)")
    public void user_enters_abhyasi_mailinator_com(String email) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.enterEmail(email);
    }

    @When("user enters password (.*)")
    public void user_enters_abhyasi(String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.enterPassword(password);
    }

    @When("user clicks submit")
    public void user_clicks_submit() throws Throwable {

        LoginPage.clickSubmit();
    }

}