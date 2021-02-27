package ro.wantsome.web_shop.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ro.wantsome.framework_ui.driver.DriverFactory;
import ro.wantsome.web_shop.components.CartProductComponent;

import java.util.List;
import java.util.stream.Collectors;

public class CartPage {

    @FindBy(css = ".woocommerce-cart-form__cart-item")
    private List<WebElement> products;

    public CartPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public List<CartProductComponent> getProducts() {

//        List<CartProductComponent> items = new ArrayList<>();
//        for(int i=0; i< products.size(); i++) {
//            items.add(new CartProductComponent(products.get(i)));
//        }
//        products.forEach(x -> items.add(new CartProductComponent(x)));
//        return items;


        return products.stream().map(CartProductComponent::new).collect(Collectors.toList());
    }
}
