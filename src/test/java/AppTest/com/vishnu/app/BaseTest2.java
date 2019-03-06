/*package AppTest.com.vishnu.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.joda.time.DateTime;


public class BaseTest2 {
//WebDriver driver;
AppiumDriver driver;

@BeforeClass
public void setUp() throws MalformedURLException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("automationName", "uiautomator2");
	caps.setCapability("udid", "N7LBGYJZ8H659DTG");
	caps.setCapability("deviceName", "Gionee");
	caps.setCapability("platformName","Android");		
	capabilities.setCapability("automationName", "XCUITest"); 
	capabilities.setCapability("deviceName","iPhone 5s");
	capabilities.setCapability("platformName","iOS");
	capabilities.setCapability("app","/Users/vishnu/Library/Developer/Xcode/DerivedData/WebDriverAgent-dikkwtrisltbeobjmfvpthwwekvs/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
   
	DesiredCapabilities caps = new DesiredCapabilities();
	caps.setCapability("os_version", "5.0");
	caps.setCapability("device", "Samsung Galaxy S6");
	caps.setCapability("real_mobile", "true");
	caps.setCapability("browserstack.local", "false");
	caps.setCapability("app","/Users/vishnu/Downloads/hfn-app-0.9.29-release.apk");
   caps.setCapability("appPackage", "com.hfn.unified");
// This package name of your app (you can get it from apk info app)
	caps.setCapability("appActivity","com.hfn.unified.view.splash.SplashActivity"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
   driver = new AndroidDriver(new URL("http://127.0.0.1:4728/wd/hub"), caps);
	//driver = new AndroidDriver(new URL("https://vishnunarala1:Kv8fHc1FsUF2tRDsHbGe@hub-cloud.browserstack.com/wd/hub"), caps);
}

@Test
public void preceptorAccept() throws Exception{
	click("com.hfn.unified:id/btn_wel_sign_in");
	click("com.hfn.unified:id/checkbox_policy");
click("com.hfn.unified:id/btn_hfn_signin");
sendKeys("com.hfn.unified:id/signin_email","preceptor.30@mailinator.com");
sendKeys("com.hfn.unified:id/signin_password","preceptor");
try {
driver.hideKeyboard();
}
catch(Exception e) {}
click("com.hfn.unified:id/btn_sign_in");
	//click("com.hfn.unified:id/proceed");
	//click("com.hfn.unified:id/nav_menu_down");
	click("com.hfn.unified:id/profile_image");
	click("com.hfn.unified:id/switch_status");
click("com.hfn.unified:id/btn_accept");
click("com.hfn.unified:id/btn_start_now");
click("com.hfn.unified:id/btn_end_session");
click("com.hfn.unified:id/btn_end");
sendKeys("com.hfn.unified:id/edittext_chat_box","How do you feel?");
click("com.hfn.unified:id/btn_send");
click("com.hfn.unified:id/nav_exit_session");
click("com.hfn.unified:id/btn_home");
}

	

//@Test
public void testSubscription() throws Exception {
   //locate the Text on the calculator by using By.name()
   WebElement two=driver.findElement(By.id("com.android.calculator2:id/digit9"));
   two.click();
   WebElement plus=driver.findElement(By.id("com.android.calculator2:id/plus"));
   plus.click();
   WebElement four=driver.findElement(By.id("com.android.calculator2:id/digit3"));
   four.click();
   WebElement equalTo=driver.findElement(By.id("com.android.calculator2:id/equal"));
   equalTo.click();
   //locate the edit box of the calculator by using By.tagName()
   //WebElement results=driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Alerts\"]"));
   //results.click();
	//Check the calculated value on the edit box
//assert results.getText().equals("=12"):"Actual value is : "+results.getText()+" did not match with expected value: 6";
	//MobileElement view3 = apDriver.
			//.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.ViewSwitcher/android.view.ViewGroup/android.widget.LinearLayout/android.view.View[3]"));
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	WebElement text = driver.findElement(By.id("au.com.sbs.twg:id/slide_title_view"));
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOf(text));
	rightLeftSwipe(2000);
	
	//if(Boolean.TRUE.equals(ExpectedConditions.textToBePresentInElementValue(text, "Stream live matches for free from the Premier League and more.")))// != Boolean.TRUE)
	//{
		rightLeftSwipe(2000);
	//}
	WebElement gotItButton = driver.findElement(By.id("au.com.sbs.twg:id/got_it_view"));
	gotItButton.click();
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/btn_wel_sign_in"))).click();
	//WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/checkbox_policy"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/btn_hfn_signin"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/signin_email"))).sendKeys("preceptor.31@mailinator.com");
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/signin_password"))).sendKeys("preceptor");
	try {
	driver.hideKeyboard();
	}
	catch(Exception e) {}
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/btn_sign_in"))).click();
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/profile_image"))).click();
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/switch_status"))).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/nav_menu_up"))).click();
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("com.hfn.unified:id/nav_title"))).get(1).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/btn_layout_proceed"))).click();
	try {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ListView/android.view.View[1]/android.view.View"))).click();
	}
	catch(Exception e) {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup[2]"
			+ "/android.webkit.WebView/android.webkit.WebView/"
			+ "android.view.View[1]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View"))).click();
	}
	try{wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("card-number"))).sendKeys("4242424242424242");}
	catch(Exception e) {
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/"
			+ "android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]/"
			+ "android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/"
			+ "android.widget.EditText"))).sendKeys("4242424242424242");
	//}
	try{wait.until(ExpectedConditions.elementToBeClickable(By.id("card-expiry-month"))).sendKeys("05");
	}
	catch(Exception e) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
		+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
		+ "/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]"
		+ "/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]"
		+ "/android.widget.EditText[1]"))).sendKeys("05");
	//}
	try {
	wait.until(ExpectedConditions.elementToBeClickable(By.id("card-expiry-year"))).sendKeys("20");
	}
	catch(Exception e) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
				+ "/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]"
				+ "/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]"
				+ "/android.widget.EditText[2]"))).sendKeys("20");
	//}
	try {
	wait.until(ExpectedConditions.elementToBeClickable(By.id("card-cvv"))).sendKeys("123");
	}
	catch(Exception e) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
				+ "/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]"
				+ "/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]"
				+ "/android.widget.EditText"))).sendKeys("123");
	//}
	try {
	wait.until(ExpectedConditions.elementToBeClickable(By.tagName("android.widget.Button"))).click();
	}
	catch(Exception e){
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/"
				+ "android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
				+ "/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]"
				+ "/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View"
				+ "/android.widget.Button"))).click();
	//}
	try {
	wait.until(ExpectedConditions.elementToBeClickable(By.id("txtPassword"))).sendKeys("1221");
	}
	catch(Exception e){
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
			+ "/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View"
			+ "/android.view.View[13]/android.view.View[2]/android.widget.EditText"))).sendKeys("1221");
	//}
	try {
	wait.until(ExpectedConditions.elementToBeClickable(By.id("cmdSubmit"))).click();
	}
	catch(Exception e){
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
				+ "/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout"
				+ "/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View"
				+ "/android.view.View[16]/android.view.View/android.view.View/android.widget.Button[1]"))).click();
		//}
	Assert.assertEquals(wait.until(ExpectedConditions.elementToBeClickable(By.id("com.hfn.unified:id/seeker_name"))).getText(),"Payment Successful!!");
	click("com.hfn.unified:id/proceed");
	click("com.hfn.unified:id/nav_menu_down");
	click("com.hfn.unified:id/profile_image");
	click("com.hfn.unified:id/switch_status");
	click("com.hfn.unified:id/profile_card4");
	click("com.hfn.unified:id/fab_add");
	//sendKeys("com.hfn.unified:id/text_start_time","0900");
	//sendKeys("com.hfn.unified:id/text_end_time","0945");
	//click("com.hfn.unified:id/day_button_box",DateTime.now().getDayOfWeek());
	//click("com.hfn.unified:id/btn_save");
	//click("Navigate up");
	//click("Navigate up");
	//com.hfn.unified:id/btn_view_more_meditation - profile icon page
	//com.hfn.unified:id/profile_image 
	//com.hfn.unified:id/switch_status
	//com.hfn.unified:id/img_logout
	//com.hfn.unified:id/profile_card4 -my availability
	//com.hfn.unified:id/btn_start - meditate now btn in tips page
	//com.hfn.unified:id/btn_later - schedule
	//com.hfn.unified:id/btn_end - yes for meditate now
	
	
	//wait.until(ExpectedConditions.elementToBeClickable(By.id("com.google.android.gms:id/account_name"))).click();
	//List<WebElement> accounts = driver.findElements(By.id("com.google.android.gms:id/account_name"));
	//accounts.get(0).click();
}

//@Test
public void scheduleAvailability() throws Exception{
	click("com.hfn.unified:id/btn_wel_sign_in");
	click("com.hfn.unified:id/checkbox_policy");
click("com.hfn.unified:id/btn_hfn_signin");
sendKeys("com.hfn.unified:id/signin_email","preceptor.31@mailinator.com");
sendKeys("com.hfn.unified:id/signin_password","preceptor");
try {
driver.hideKeyboard();
}
catch(Exception e) {}
click("com.hfn.unified:id/btn_sign_in");
	//click("com.hfn.unified:id/proceed");
	//click("com.hfn.unified:id/nav_menu_down");
	click("com.hfn.unified:id/profile_image");
	click("com.hfn.unified:id/switch_status");
	click("com.hfn.unified:id/profile_card4");
	click("com.hfn.unified:id/fab_add");
	//sendKeys("com.hfn.unified:id/text_start_time","0900");
	//sendKeys("com.hfn.unified:id/text_end_time","0945");
	//click("com.hfn.unified:id/day_button_box",DateTime.now().getDayOfWeek());
	//click("com.hfn.unified:id/btn_save");
}

public void click(String locator) {
	WebDriverWait wait = new WebDriverWait(this.driver,40);
	wait.until(ExpectedConditions.elementToBeClickable(By.id(locator))).click();	
}

public void click(String locator, Integer num) {
	WebDriverWait wait = new WebDriverWait(this.driver,10);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(locator))).get(num).click();	
}

public void sendKeys(String locator, String keys) {
	WebDriverWait wait = new WebDriverWait(this.driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(By.id(locator))).sendKeys(keys);	
}

public void rightLeftSwipe(int timeduration) {
	 

	  Dimension size = driver.manage().window().getSize();
	  System.out.println(size);
	  int startx = (int) (size.width * 0.80);
	  int endx = (int) (size.width * 0.20);
	  int starty = size.height / 2;
	  System.out.println("Start swipe operation");
	  driver.swipe(startx, starty, endx, starty, timeduration);
	  
	 }

@AfterClass
public void teardown(){
	//close the app
	driver.quit();
}
}*/