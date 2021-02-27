package ro.wantsome.framework_ui.components;

import org.openqa.selenium.WebElement;
import ro.wantsome.framework_ui.driver.DriverFactory;

public class ButtonComponent extends BaseComponent {
    public ButtonComponent(WebElement baseElement) {
        super(baseElement);
    }

    public void click() {
        getBaseElement().click();
    }
}
