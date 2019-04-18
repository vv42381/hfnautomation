package pages;

import elements.Button;
import org.openqa.selenium.support.FindAll;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public AppiumDriver driver;
	
	public LoginPage(AppiumDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/checkbox_policy"),
	//@AndroidFindBy(xpath="//*[@id='com.hfn.unified:id/checkbox_policy']")
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"icon uncheck\"]")
	})
	public static WebElement chbx_policy;
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/btn_hfn_signin"),
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"icon mail\"]")
	})
	public static WebElement email_signin;
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/signin_email"),
	@FindBy(xpath="//XCUIElementTypeApplication[@name='HeartsApp']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField")
	})
	public static WebElement email;
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/signin_password"),
	@FindBy(xpath="//XCUIElementTypeApplication[@name=\"HeartsApp\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
	})
	public static WebElement password;
	
	@FindAll({
	@FindBy(id="com.hfn.unified:id/btn_sign_in"),
	@FindBy(xpath="//XCUIElementTypeButton[@name=\"Sign In\"]")
	})
	public static WebElement btn_submit;
	
    //public static final Button btn_wel_sign_in= new Button(By.id("com.hfn.unified:id/btn_wel_sign_in"));
    //public static final Checkbox chbx_policy = new Checkbox(By.id("com.hfn.unified:id/checkbox_policy"));
    //public static final Button email_signin = new Button(By.id("com.hfn.unified:id/btn_hfn_signin"));
    //public static final TextBox email = new TextBox(By.id("com.hfn.unified:id/signin_email"));
    //public static final TextBox password = new TextBox(By.id("com.hfn.unified:id/signin_password"));
    //public static final Button btn_submit = new Button(By.id("com.hfn.unified:id/btn_sign_in"));
    
    public static void clickCheckboxPolicy() throws InterruptedException {
    	//chbx_policy.tap();
    	Thread.sleep(3000);
    	chbx_policy.click();
    }
    
    public static void clickSignInEmail() {
    	//email_signin.tap();
    	email_signin.click();
    }
    
    public static void enterEmail(String value) throws InterruptedException {
    	//email.setValue(value);
    	Thread.sleep(3000);
    	email.sendKeys(value);
    }
    
    public static void enterPassword(String value) {
    	//password.setValue(value);
    	password.sendKeys(value);
    }
    
    public static void clickSubmit() throws Throwable {
    	//btn_submit.tap();
    	btn_submit.click();
    }

}
