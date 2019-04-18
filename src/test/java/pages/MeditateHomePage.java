package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.AppiumDriverUtil;

public class MeditateHomePage {
	public AppiumDriver driver;
	
	public MeditateHomePage(AppiumDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/title_meditation"),
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Meditate\"]")
	})
	public static WebElement textMeditate;
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/profile_image"),
	@FindBy(name="avatar")
	})
	@iOSFindBy(accessibility="avatar") //XCUIElementTypeButton[@name="avatar"]
	public static WebElement btn_profile_image;
	
	@FindBy(id="android:id/button3")
	public static WebElement btn_ignore;
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/btn_view_more_meditation"),
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Be Guided\"]")
	})
	public static WebElement btn_be_guided;
	
    //public static final TextView textMeditate = new TextView(By.id("com.hfn.unified:id/title_meditation"));
    //public static final Button btn_profile_image= new Button(By.id("com.hfn.unified:id/profile_image"));
    //public static final Button btn_be_guided= new Button(By.id("com.hfn.unified:id/btn_view_more_meditation"));
    
    public static void clickProfileImage() {
    	//btn_profile_image.tap();
    	btn_profile_image.click();
    }
   
    public static void clickBeGuided() {
    	//btn_be_guided.tap();
    	btn_be_guided.click();
    }
    
    public static String getText() throws InterruptedException {
        //return textMeditate.getValue();
    	Thread.sleep(12000);
    	if(AppiumDriverUtil.driverType=="Android")
    	{
    	if(btn_ignore.isDisplayed())
    	{
    		btn_ignore.click();
    	}
    	}
    	Thread.sleep(3000);
    	AppiumDriverUtil.setContext();
        return textMeditate.getText();
    }

}
