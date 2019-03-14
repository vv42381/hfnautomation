package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import org.openqa.selenium.By;

public class ProfilePage {

    public static final TextView textMeditate = new TextView(By.id("com.hfn.unified:id/title_meditation"));
    public static final Button btn_subscription= new Button(By.id("com.hfn.unified:id/profile_card6"));
    public static final Button btn_be_guided= new Button(By.id("com.hfn.unified:id/btn_view_more_meditation"));
    
    public static void clickSubscription() {
    	btn_subscription.tap();
    }
   
    public static void clickBeGuided() {
    	btn_be_guided.tap();
    }
    
    public static String getText() {
        return textMeditate.getValue();
    }

}
