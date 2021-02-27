package ro.wantsome.framework_ui.components;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import ro.wantsome.framework_ui.driver.DriverFactory;

import java.time.Duration;

public abstract class BaseComponent {
    private WebElement baseElement;

    public BaseComponent(WebElement baseElement) {
        this.baseElement = baseElement;
    }

    public String getText() {
        baseElement = getFluentWait().until(ExpectedConditions.visibilityOf(baseElement));

        return baseElement.getText();
    }

    protected WebElement getBaseElement() {
        baseElement = getFluentWait().until(ExpectedConditions.visibilityOf(baseElement));

        return baseElement;
    }

    public boolean isDisplayed() {
        return baseElement.isDisplayed();
    }

    public WebElement getDescendant(final By descendantsLocator) {
        return getBaseElement().findElement(descendantsLocator);
    }

    protected Wait<WebDriver> getFluentWait() {
        int TIMEOUT_SECONDS = 60;
        int POOLING_PERIOD = 1;

        return new FluentWait<>(DriverFactory.getDriver())
                .withTimeout(Duration.ofSeconds(TIMEOUT_SECONDS))
                .pollingEvery(Duration.ofSeconds(POOLING_PERIOD))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(StaleElementReferenceException.class);
    }

    @Override
    public String toString() {
        return isDisplayed() ? getText() : "Not Visible !";
    }
}
