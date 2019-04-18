package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import base.AppiumDriverUtil;

public class IntrospectPage {
	public AppiumDriver driver;	
	public String today = null;
	
	public IntrospectPage(AppiumDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	@FindAll({
	@FindBy(id="com.hfn.unified:id/title_introspection"),
	@FindBy(xpath="//XCUIElementTypeStaticText[@name=\"Introspect\"]")
	})
	public static WebElement textIntrospect;
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/profile_image"),
	@FindBy(name="avatar")
	})
	@iOSFindBy(accessibility="avatar") //XCUIElementTypeButton[@name="avatar"]
	public static WebElement btn_profile_image;
	
	@FindBy(id="android:id/button3")
	public static WebElement btn_ignore;
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/btn_view_more_introspection"),
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Make Note\"]")
	})
	public static WebElement btn_make_note;
	
	@FindBy(id="com.hfn.unified:id/toolbar_title")
	public static WebElement textJournal;
	
	@FindBy(id="com.hfn.unified:id/img_diary")
	public static WebElement img_diary;
	
	@FindBy(id="com.hfn.unified:id/fab_add")
	public static WebElement btn_add;
	
	@FindBy(id="com.hfn.unified:id/text_body")
	public static WebElement txtJournalEntry;
	
	@FindBy(id="com.hfn.unified:id/nav_save")
	public static WebElement btn_save;
	
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
    
    public static void clickOnDiary() throws InterruptedException{
    	//btn_be_guided.tap();
    	Thread.sleep(3000);
    	img_diary.click();
    }
    
    public static void clickOnAddButton() throws InterruptedException{
    	//btn_be_guided.tap();
    	Thread.sleep(3000);
    	btn_add.click();
    }
    
    public void setJournalEntryAsDate() throws InterruptedException{
    	//btn_be_guided.tap();
    	Thread.sleep(3000);
    	Date date = Calendar.getInstance().getTime();
		// Display a date in day, month, year format
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		today = formatter.format(date);
    	txtJournalEntry.sendKeys(today);
    }
    
    public static void clickSaveBtn() {
    	//btn_be_guided.tap();
    	btn_save.click();
    }
    
    public void validateJournalEntryAsDate() throws InterruptedException{
    	//btn_be_guided.tap();
    	Thread.sleep(3000);
    	AssertJUnit.assertEquals("Wrong text", today, txtJournalEntry.getText());
    }
    
    
}
