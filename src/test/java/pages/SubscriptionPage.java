package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import org.openqa.selenium.By;

public class SubscriptionPage {

    public static final TextView textMeditate = new TextView(By.id("com.hfn.unified:id/title_meditation"));
    public static final Button btn_upgrade= new Button(By.id("com.hfn.unified:id/btn_upgrade"));
    public static final Button btn_proceed= new Button(By.id("com.hfn.unified:id/btn_layout_proceed"));
    public static final Button btn_credit_card= new Button(By.xpath("//android.widget.LinearLayout/android.view.ViewGroup[2]/android.webkit.WebView/android.webkit.WebView/android.view.View[1]"));
    
    public static void clickUpgrade() {
    	btn_upgrade.tap();
    }
   
    public static void clickProceed() {
    	btn_proceed.tap();
    }
    
    public static void clickCreditCard() {
    	btn_credit_card.tap();
    }
    
    public static String getText() {
        return textMeditate.getValue();
    }

}
