package steps;

import base.AppiumDriverUtil;
import base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

import org.testng.AssertJUnit;

import pages.DiscoverPage;
import pages.ExplorePage;
import pages.InspirePage;
import pages.IntrospectPage;
import pages.LoginPage;
import pages.MeditateHomePage;
import pages.SigninPage;

public class CommonPageSteps extends BaseStep {
	public AppiumDriver driver = AppiumDriverUtil.getDriver();

	@Then("text displayed should be (.*)")
	public void text_displayed_should_be(String text) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		switch(text.toUpperCase()) {
		case "MEDITATE":
			MeditateHomePage MeditateHomePage = new MeditateHomePage(driver);
			AssertJUnit.assertEquals("Wrong text", text, MeditateHomePage.getText());
			break;
		case "INTROSPECT":
			IntrospectPage IntrospectPage = new IntrospectPage(driver);
			AssertJUnit.assertEquals("Wrong text", text, IntrospectPage.getText());
			break;	    	
		case "READ & REFLECT":
			InspirePage InspirePage = new InspirePage(driver);
			AssertJUnit.assertEquals("Wrong text", text, InspirePage.getText());
			break;
		case "EXPLORE":
			DiscoverPage DiscoverPage = new DiscoverPage(driver);
			AssertJUnit.assertEquals("Wrong text", text, DiscoverPage.getText());
			break;
		case "ENGAGE":
			ExplorePage ExplorePage = new ExplorePage(driver);
			AssertJUnit.assertEquals("Wrong text", text, ExplorePage.getText());
			break;
		}   	

	}

	@Then("text displayed in toolbar should be (.*)")
	public void text_displayed_in_toolbar_should_be(String text) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		switch(text.toUpperCase()) {
		/*case "MEDITATE":
	    		MeditateHomePage MeditateHomePage = new MeditateHomePage(driver);
	    		AssertJUnit.assertEquals("Wrong text", text, MeditateHomePage.getText());
	    		break;*/
		case "JOURNAL":
			IntrospectPage IntrospectPage = new IntrospectPage(driver);
			AssertJUnit.assertEquals("Wrong text", text, IntrospectPage.getToolBarText());
			break;	    	
		case "READ & REFLECT":
			InspirePage InspirePage = new InspirePage(driver);
			AssertJUnit.assertEquals("Wrong text", text, InspirePage.getToolBarText());
			break;
		case "EXPLORE":
			DiscoverPage DiscoverPage = new DiscoverPage(driver);
			AssertJUnit.assertEquals("Wrong text", text, DiscoverPage.getToolBarText());
			break;
		case "ENGAGE":
			ExplorePage ExplorePage = new ExplorePage(driver);
			AssertJUnit.assertEquals("Wrong text", text, ExplorePage.getToolBarText());
			break;
		}   	

	}


}