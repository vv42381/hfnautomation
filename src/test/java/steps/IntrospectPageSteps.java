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
    
    @When("user clicks on diary image")
    public void user_clicks_on_diary_image() throws Throwable {

    	IntrospectPage.clickOnDiary();
    }

    @When("user clicks on add button")
    public void user_clicks_on_add_button() throws Throwable {

    	IntrospectPage.clickOnAddButton();
    }
    
    @When("user enters journal text as date")
    public void user_enters_journal_text_as_date() throws Throwable {

    	IntrospectPage.setJournalEntryAsDate();
    }
    
    @When("user saves the entry")
    public void user_saves_the_entry() throws Throwable {

    	IntrospectPage.clickSaveBtn();
    }
    
    @Then("validate journal entry is saved")
    public void validate_journal_entry_is_saved() throws Throwable {

    	IntrospectPage.validateJournalEntryAsDate();
    }

}