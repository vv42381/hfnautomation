package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import org.openqa.selenium.By;

public class MeditateHomePage {

    public static final TextView textMeditate = new TextView(By.id("com.hfn.unified:id/title_meditation"));
    public static final Button btn_profile_image= new Button(By.id("com.hfn.unified:id/profile_image"));
    public static final Button btn_be_guided= new Button(By.id("com.hfn.unified:id/btn_view_more_meditation"));
    
    public static void clickProfileImage() {
    	btn_profile_image.tap();
    }
   
    public static void clickBeGuided() {
    	btn_be_guided.tap();
    }
    
    public static String getText() {
        return textMeditate.getValue();
    }

}
