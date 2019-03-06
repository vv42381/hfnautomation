package stepDefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class StepDefinitions {
	AppiumDriver driver;

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName", "uiautomator");
		caps.setCapability("deviceName", "Lenovo");
		caps.setCapability("udid", "0123456789ABCDEF");
		caps.setCapability("platformName","Android");		
		/*caps.setCapability("automationName", "XCUITest"); 
		capabilities.setCapability("deviceName","iPhone 5s");
		capabilities.setCapability("platformName","iOS");
		capabilities.setCapability("app","/Users/vishnu/Library/Developer/Xcode/DerivedData/WebDriverAgent-dikkwtrisltbeobjmfvpthwwekvs/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
	   
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os_version", "7.0");
		caps.setCapability("device", "Samsung Galaxy S8");
		caps.setCapability("real_mobile", "true");
		caps.setCapability("browserstack.local", "false");*/
		//caps.setCapability("app","/Users/vishnu/Downloads/hfn-app-0.9.29-release.apk");
	   caps.setCapability("appPackage", "com.hfn.unified");
	// This package name of your app (you can get it from apk info app)
		caps.setCapability("appActivity","com.hfn.unified.view.splash.SplashActivity"); // This is Launcher activity of your app (you can get it from apk info app)
	//Create RemoteWebDriver instance and connect to the Appium server
	 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
	   try {
		driver = new AndroidDriver(new URL("http://127.0.0.1:4730/wd/hub"), caps);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	    
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    
	    
	}

	@When("I complete action")
	public void i_complete_action() {
	    
	    
	}

	@When("some other action")
	public void some_other_action() {
	    
	    
	}

	@When("yet another action")
	public void yet_another_action() {
	    
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	    
	}

	@Given("I want to write a step with name{int}")
	public void i_want_to_write_a_step_with_name(Integer int1) {
	    
	    
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    
	    
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    
	    
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_Fail_in_step() {
	    
	    
	}
}
