package elements;

import elements.base.BaseField;
import elements.base.ClickableField;
import org.openqa.selenium.By;

public class Checkbox extends ClickableField {
    public Checkbox(BaseField parent, By locator) {
        super(parent, locator);
    }

    public Checkbox(By locator) {
        super(locator);
    }
}
