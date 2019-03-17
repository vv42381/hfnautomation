package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	public AppiumDriver driver;
	
	public SigninPage(AppiumDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	@FindAll({
		@FindBy(id="com.hfn.unified:id/btn_wel_sign_in"),
		@FindBy(name="Sign in")
		})
	//@AndroidFindBy(xpath="//*[@id='com.hfn.unified:id/btn_wel_sign_in']")
	@iOSFindBy(accessibility="Sign in") //XCUIElementTypeButton[@name="Sign in"]
	public static WebElement btn_wel_sign_in;
	
	public static Boolean isOpen() {
        //return btn_wel_sign_in.isDisplayedWithWait();
    	return true;
    }
    
    public static void clickSignInBtn() throws InterruptedException {
    	//btn_wel_sign_in.tap();
    	Thread.sleep(9000);
        btn_wel_sign_in.click();
    }
    
}
