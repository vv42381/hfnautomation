package pages;

import elements.Button;
import elements.Checkbox;
import elements.TextBox;
import elements.TextView;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Button btn_wel_sign_in= new Button(By.id("com.hfn.unified:id/btn_wel_sign_in"));
    public static final Checkbox chbx_policy = new Checkbox(By.id("com.hfn.unified:id/checkbox_policy"));
    public static final Button email_signin = new Button(By.id("com.hfn.unified:id/btn_hfn_signin"));
    public static final TextBox email = new TextBox(By.id("com.hfn.unified:id/signin_email"));
    public static final TextBox password = new TextBox(By.id("com.hfn.unified:id/signin_password"));
    public static final Button btn_submit = new Button(By.id("com.hfn.unified:id/btn_sign_in"));
    public static final TextView textMeditate = new TextView(By.id("com.hfn.unified:id/title_meditation"));
    public static final Button btnDivide = new Button(By.id("divide"));
    public static final Button btnMultiply = new Button(By.id("multiply"));
    public static final Button btnPower = new Button(By.id("power"));
    public static final TextView txvResult = new TextView(By.id("result"));

    public static Boolean isOpen() {
        return btn_wel_sign_in.isDisplayedWithWait();
    }
    
    public static void clickSignInBtn() {
        btn_wel_sign_in.tap();
    }
    
    public static void clickCheckboxPolicy() {
    	chbx_policy.tap();
    }
    
    public static void clickSignInEmail() {
    	email_signin.tap();
    }
    
    public static void enterEmail(String value) {
    	email.setValue(value);
    }
    
    public static void enterPassword(String value) {
    	password.setValue(value);
    }
    
    public static void clickSubmit() throws Throwable {
    	btn_submit.tap();
    }
    
    public static String getText() {
        return textMeditate.getValue();
    }
    
    public static String getResult() {
        return txvResult.getValue().substring(8);
    }
}
