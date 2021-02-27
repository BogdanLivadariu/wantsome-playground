package ro.wantsome.web_shop.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ro.wantsome.web_shop.components.CartProductComponent;
import ro.wantsome.web_shop.page_objects.CartPage;
import ro.wantsome.web_shop.page_objects.ConnectPage;

import static org.testng.AssertJUnit.assertEquals;

//@Apirole(ADMIN)
public class CartTest extends BaseTest {

    //    @Inject
//    private final CartPage page;

    private final CartPage cartPage = new CartPage();

    private final ConnectPage connectPage = new ConnectPage();

    @BeforeClass
    public void performLogin() {


//        client.performAction();
//        connectPage.loginSection.login("x", "y");

//        cartPage.getrows().get(1).findElements("columns locator").get(5).getText()
    }

    @Test
    public void someCartChecks() {
        assertEquals(0, cartPage.getProducts().size());

        cartPage.getProducts().get(0).getText();

//        cartPage.getProducts().get(1).inputQuantity()
//
//        cartPage.getProducts().get(0).labelSubTotal().getText();
//        CartProductComponent someRow = cartPage.getProducts().get(0);

//        cartPage.getrows().get(1).findElements("columns locator").get(5).getText()
//
//        assertTrue(someRow.buttonRemove().isDisplayed());
//        assertEquals("Some name", someRow.labelName().getText());
//        assertEquals("1", someRow.inputQuantity().getText());
//        assertEquals("1", someRow.labelPrice().getText());
//        assertEquals("1", someRow.labelSubTotal().getText());
    }
}
