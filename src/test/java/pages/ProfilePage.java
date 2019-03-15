package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	public AppiumDriver driver;
	
	public ProfilePage(AppiumDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="com.hfn.unified:id/profile_card6")
	public static WebElement btn_subscription;

    //public static final Button btn_subscription= new Button(By.id("com.hfn.unified:id/profile_card6"));

    
    public static void clickSubscription() {
    	//btn_subscription.tap();
    	btn_subscription.click();
    }
 

}
