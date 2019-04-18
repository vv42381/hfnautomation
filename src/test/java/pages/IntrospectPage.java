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

public class IntrospectPage {
	public AppiumDriver driver;
	
	public IntrospectPage(AppiumDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="com.hfn.unified:id/title_introspection")
	public static WebElement textIntrospect;
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/profile_image"),
	@FindBy(name="avatar")
	})
	@iOSFindBy(accessibility="avatar") //XCUIElementTypeButton[@name="avatar"]
	public static WebElement btn_profile_image;
	
	@FindBy(id="android:id/button3")
	public static WebElement btn_ignore;
	
	@FindBy(id="com.hfn.unified:id/btn_view_more_introspection")
	public static WebElement btn_make_note;
	
	@FindBy(id="com.hfn.unified:id/toolbar_title")
	public static WebElement textJournal;
	
    //public static final TextView textMeditate = new TextView(By.id("com.hfn.unified:id/title_meditation"));
    //public static final Button btn_profile_image= new Button(By.id("com.hfn.unified:id/profile_image"));
    //public static final Button btn_be_guided= new Button(By.id("com.hfn.unified:id/btn_view_more_meditation"));
    
    public static void clickProfileImage() {
    	//btn_profile_image.tap();
    	btn_profile_image.click();
    }
   
    public static void clickMakeNote() {
    	//btn_be_guided.tap();
    	btn_make_note.click();
    }
    
    public static String getText() throws InterruptedException {
        //return textMeditate.getValue();
    	Thread.sleep(3000);
        return textIntrospect.getText();
    }
    
    public static String getToolBarText() throws InterruptedException {
        //return textMeditate.getValue();
    	Thread.sleep(3000);
        return textJournal.getText();
    }

}
