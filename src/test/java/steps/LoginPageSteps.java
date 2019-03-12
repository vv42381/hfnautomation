package steps;

import base.BaseStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.AssertJUnit;

import pages.LoginPage;

public class LoginPageSteps extends BaseStep {
    @Given("^user open heartsapp$")
    public void userOpensCalc() throws Throwable {
        AssertJUnit.assertTrue("Application is not open", LoginPage.isOpen());
    }
    
    @When("user clicks on signin")
    public void user_clicks_on_signin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LoginPage.clickSignInBtn();
    }


    @When("^user tap (.*) button (.*) times$")
    public void userTapButtonTimes(String button, int count) throws Throwable {
        switch (button) {
            case "ADD":
                LoginPage.btnSubtract.tap(count);
                break;
            case "SUBTRACT":
                LoginPage.btnSubtract.tap(count);
                break;
            case "SQUARE ROOT":
                LoginPage.btnSqrt.tap(count);
                break;
            case "DIVIDE by 2":
                LoginPage.btnDivide.tap(count);
                break;
            case "MULTIPLY by 2":
                LoginPage.btnMultiply.tap(count);
                break;
            case "POWER by 2":
                LoginPage.btnPower.tap(count);
        }
    }

    @Then("^the result should be (.*)$")
    public void theResultShouldBe(String expectedResult) throws Throwable {
        AssertJUnit.assertEquals("Wrong result", expectedResult, LoginPage.getResult());
    }

}