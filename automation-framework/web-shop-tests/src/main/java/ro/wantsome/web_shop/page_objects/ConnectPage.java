package ro.wantsome.web_shop.page_objects;

import org.openqa.selenium.support.PageFactory;
import ro.wantsome.framework_ui.driver.DriverFactory;
import ro.wantsome.web_shop.page_objects.sections.LoginSection;

public class ConnectPage {

    public LoginSection loginSection = new LoginSection();

    public ConnectPage() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}
