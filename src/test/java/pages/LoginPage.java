package pages;

import elements.Button;
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
	@FindBy(id="com.hfn.unified:id/checkbox_policy")
	//@AndroidFindBy(xpath="//*[@id='com.hfn.unified:id/checkbox_policy']")
	@AndroidFindBy(id="com.hfn.unified:id/checkbox_policy")
	public static WebElement chbx_policy;
	
	@FindBy(id="com.hfn.unified:id/btn_hfn_signin")
	public static WebElement email_signin;
	
	@FindBy(id="com.hfn.unified:id/signin_email")
	public static WebElement email;
	
	@FindBy(id="com.hfn.unified:id/signin_password")
	public static WebElement password;
	
	@FindBy(id="com.hfn.unified:id/btn_sign_in")
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
