package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import elements.base.EditableField;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.AppiumDriverUtil;

public class SubscriptionPage {
	
	public AppiumDriver driver;
	
	public SubscriptionPage(AppiumDriver driver) {           
        this.driver = driver; 
        PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="com.hfn.unified:id/btn_upgrade")
	public static WebElement btn_upgrade;
	
	@FindBy(id="com.hfn.unified:id/btn_layout_proceed")
	public static WebElement btn_proceed;
	@FindAll({
	@FindBy(xpath="//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View"),
	@FindBy(xpath="(//android.view.View[@content-desc='CREDIT CARD'])[1]")
	})
	public static WebElement btn_credit_card;
	
	@FindAll({
	@FindBy(id="card-number"),
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Card Number\"]")
	})
	public static WebElement credit_card_no;
	
	@FindAll({
	@FindBy(id="card-expiry-month"),
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Expiry MM\"]")
	})
	//@AndroidFindBy(id="card-expiry-month")
	public static WebElement credit_card_month;
	
	@FindAll({
	@FindBy(id="card-expiry-year"),
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"YY\"]")
	})
	public static WebElement credit_card_year;
	
	@FindAll({
	@FindBy(id="card-cvv"),
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"CVV\"]")
	})
	public static WebElement credit_card_cvv;
	
	@FindAll({
	@FindBy(xpath="//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.Button"),
	@FindBy(xpath="//android.widget.Button[contains(@content-desc,'PAY')]")
	})
	public static WebElement btn_credit_card_pay;
	
	@FindAll({
	@FindBy(xpath="//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[13]/android.view.View[2]/android.widget.EditText"),
	@FindBy(id="txtPassword")
	})
	public static WebElement credit_card_password;
	
	@FindAll({
	@FindBy(xpath="//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[16]/android.view.View/android.view.View/android.widget.Button[1]"),
	@FindBy(id="cmdSubmit")
	})
	public static WebElement btn_credit_card_password_submit;
	
	@FindBy(id="com.hfn.unified:id/seeker_name")
	public static WebElement textPaymentConfirmation;
	
    //public static final Button btn_upgrade= new Button(By.id("com.hfn.unified:id/btn_upgrade"));
    
    //public static final Button btn_proceed= new Button(By.id("com.hfn.unified:id/btn_layout_proceed"));
    //public static final Button btn_credit_card= new Button(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View"));
    //public static final TextBox credit_card_no = new TextBox(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));
    //public static final TextBox credit_card_month = new TextBox(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.EditText[1]"));
    //public static final TextBox credit_card_year = new TextBox(By.id("card-expiry-year"));
    //public static final TextBox credit_card_cvv = new TextBox(By.id("card-cvv"));
    //public static final Button btn_credit_card_pay= new Button(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.Button"));
    //public static final TextBox credit_card_password = new TextBox(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[13]/android.view.View[2]/android.widget.EditText"));
    //public static final Button btn_credit_card_password_submit = new Button(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[16]/android.view.View/android.view.View/android.widget.Button[1]"));
    //public static final TextView textPaymentConfirmation = new TextView(By.id("com.hfn.unified:id/seeker_name"));
    public static final Button btn_confirmation_proceed= new Button(By.id("com.hfn.unified:id/proceed"));
    public static final TextView textFirstSubscriptionTitle = new TextView(By.xpath("//android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]"));
	
    public static void clickUpgrade() throws InterruptedException {
    	//btn_upgrade.click();
    	Thread.sleep(12000);
    	btn_upgrade.click();
    }
   
    public static void clickProceed() throws InterruptedException {
    	//btn_proceed.click();
    	Thread.sleep(12000);
    	btn_proceed.click();
    }
    
    public static void clickCreditCard() throws InterruptedException {
    	Thread.sleep(12000);
    	//btn_credit_card.click();
    	btn_credit_card.click();
    }
    
    public static void submitCreditCardDetails() throws InterruptedException {
    	Thread.sleep(12000);
    	credit_card_no.sendKeys("4242424242424242");
    	credit_card_month.click();
    	credit_card_month.clear();
    	Thread.sleep(3000);
    	(credit_card_month).sendKeys("12");
    	Thread.sleep(3000);
    	credit_card_year.sendKeys("30");
    	Thread.sleep(3000);
    	credit_card_cvv.sendKeys("111");
    	Thread.sleep(3000);
    	btn_credit_card_pay.click();
    }
    
    public static void submitCreditCardPassword() throws InterruptedException {
    	Thread.sleep(12000);
    	credit_card_password.sendKeys("1221");
    	btn_credit_card_password_submit.click();
    }

    public static String getPaymentConfirmation() throws InterruptedException {
    	Thread.sleep(12000);
    	AppiumDriverUtil.setContext();
    	return textPaymentConfirmation.getText();
    }
}
