package ro.wantsome.web_shop.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ro.wantsome.framework_ui.components.BaseComponent;
import ro.wantsome.framework_ui.components.ButtonComponent;
import ro.wantsome.framework_ui.components.InputComponent;
import ro.wantsome.framework_ui.components.LabelComponent;

public class CartProductComponent extends BaseComponent {
    private final By remove = By.cssSelector(".product-remove > a");

    private final By name = By.cssSelector(".product-name");

    private final By price = By.cssSelector(".product-price");

    private final By quantity = By.cssSelector(".quantity > input");

    private final By subTotal = By.cssSelector(".product-subtotal");

    public CartProductComponent(WebElement baseElement) {
        super(baseElement);
    }

    public ButtonComponent buttonRemove() {
        return new ButtonComponent(getDescendant(remove));
    }

    public LabelComponent labelName() {
        return new LabelComponent(getDescendant(name));
    }

    public LabelComponent labelPrice() {
        return new LabelComponent(getDescendant(price));
    }

    public InputComponent inputQuantity() {
        return new InputComponent(getDescendant(quantity));
    }

    public LabelComponent labelSubTotal() {
        return new LabelComponent(getDescendant(subTotal));
    }

}
