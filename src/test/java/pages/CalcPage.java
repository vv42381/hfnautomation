package pages;

import elements.Button;
import elements.TextView;
import org.openqa.selenium.By;

public class CalcPage {
    public static final Button btn_wel_sign_in= new Button(By.id("com.hfn.unified:id/btn_wel_sign_in"));
    public static final Button btnSubtract = new Button(By.id("subtract"));
    public static final Button btnSqrt = new Button(By.id("sqrt"));
    public static final Button btnDivide = new Button(By.id("divide"));
    public static final Button btnMultiply = new Button(By.id("multiply"));
    public static final Button btnPower = new Button(By.id("power"));
    public static final TextView txvResult = new TextView(By.id("result"));

    public static Boolean isOpen() {
        return btn_wel_sign_in.isDisplayedWithWait();
    }

    public static String getResult() {
        return txvResult.getValue().substring(8);
    }
}
