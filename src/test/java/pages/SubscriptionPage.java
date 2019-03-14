package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import org.openqa.selenium.By;

import base.AppiumDriverUtil;

public class SubscriptionPage {

    public static final Button btn_upgrade= new Button(By.id("com.hfn.unified:id/btn_upgrade"));
    public static final Button btn_proceed= new Button(By.id("com.hfn.unified:id/btn_layout_proceed"));
    public static final Button btn_credit_card= new Button(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View"));
    public static final TextBox credit_card_no = new TextBox(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"));
    public static final TextBox credit_card_month = new TextBox(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.widget.EditText[1]"));
    public static final TextBox credit_card_year = new TextBox(By.id("card-expiry-year"));
    public static final TextBox credit_card_cvv = new TextBox(By.id("card-cvv"));
    public static final Button btn_credit_card_pay= new Button(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[4]/android.view.View[2]/android.view.View[1]/android.view.View/android.view.View/android.widget.Button"));
    public static final TextBox credit_card_password = new TextBox(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[13]/android.view.View[2]/android.widget.EditText"));
    public static final Button btn_credit_card_password_submit = new Button(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[16]/android.view.View/android.view.View/android.widget.Button[1]"));
    public static final TextView textPaymentConfirmation = new TextView(By.id("com.hfn.unified:id/seeker_name"));
    public static final Button btn_confirmation_proceed= new Button(By.id("com.hfn.unified:id/proceed"));
    public static final TextView textFirstSubscriptionTitle = new TextView(By.xpath("//android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView[1]"));
    
    public static void clickUpgrade() {
    	btn_upgrade.tap();
    }
   
    public static void clickProceed() {
    	btn_proceed.tap();
    }
    
    public static void clickCreditCard() throws InterruptedException {
    	Thread.sleep(12000);
    	AppiumDriverUtil.setContext();
    	btn_credit_card.tap();
    }
    
    public static void submitCreditCardDetails() {
    	credit_card_no.setValue("4242424242424242");
    	credit_card_month.setValue("12");
    	credit_card_year.setValue("30");
    	credit_card_cvv.setValue("111");
    	btn_credit_card_pay.tap();
    }
    
    public static void submitCreditCardPassword() throws InterruptedException {
    	Thread.sleep(12000);
    	credit_card_password.setValue("1221");
    	btn_credit_card_password_submit.tap();
    }

    public static String getPaymentConfirmation() throws InterruptedException {
    	Thread.sleep(12000);
    	AppiumDriverUtil.setContext();
    	return textPaymentConfirmation.getValue();
    }
}
