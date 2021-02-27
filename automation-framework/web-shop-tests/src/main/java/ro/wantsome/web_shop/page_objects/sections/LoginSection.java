package ro.wantsome.web_shop.page_objects.sections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ro.wantsome.framework_ui.components.ButtonComponent;
import ro.wantsome.framework_ui.components.InputComponent;
import ro.wantsome.framework_ui.driver.DriverFactory;

public class LoginSection {
    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "login")
    private WebElement login;

    @FindBy(css = ".lost_password > a")
    private WebElement lostPassword;

    public LoginSection() {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    public InputComponent inputUsername() {
        return new InputComponent(userName);
    }

    public InputComponent inputPassword() {
        return new InputComponent(password);
    }

    public ButtonComponent buttonLogin() {
        return new ButtonComponent(login);
    }

    public ButtonComponent buttonLostPassword() {
        return new ButtonComponent(lostPassword);
    }

    public void login(String username, String password) {
        inputUsername().setText(username);
        inputPassword().setText(password);
        buttonLogin().click();
    }
}
