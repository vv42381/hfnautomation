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

public class MeditateHomePage {
	public AppiumDriver driver;
	
	public MeditateHomePage(AppiumDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="com.hfn.unified:id/title_meditation")
	public static WebElement textMeditate;
	
	@FindBy(id="com.hfn.unified:id/profile_image")
	public static WebElement btn_profile_image;
	
	@FindBy(id="com.hfn.unified:id/btn_view_more_meditation")
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
        return textMeditate.getText();
    }

}
