package ro.wantsome.framework_ui.components;

import org.openqa.selenium.WebElement;

public class InputComponent extends BaseComponent {
    public InputComponent(WebElement baseElement) {
        super(baseElement);
    }


    public void setText(String text) {
        getBaseElement().clear();
        getBaseElement().sendKeys(text);
    }

    @Override
    public String getText() {
        return getBaseElement().getAttribute("value");
    }
}
