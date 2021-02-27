package ro.wantsome.framework_ui.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ro.wantsome.common.EnvironmentUtil;

public class DriverFactory {
    private static final DriverFactory INSTANCE = new DriverFactory();

    private DriverFactory() {

    }

    private final ThreadLocal<WebDriver> driver = ThreadLocal.withInitial(() -> {
        BROWSERS browser = BROWSERS.fromName(EnvironmentUtil.getBrowser());
        WebDriver driver;
        switch (browser) {
            case CHROME:
            default:
                driver = initChromeDriver();
                break;
            case FIREFOX:
                driver = initFirefoxDriver();
                break;
        }

        return driver;
    });

    private WebDriver initFirefoxDriver() {
        //TODO: use your own driver path
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\bobo\\Downloads\\geckodriver.exe");

        return new FirefoxDriver();
    }

    private WebDriver initChromeDriver() {
        //TODO: use your own driver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\bobo\\Downloads\\chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver getDriver() {
        return INSTANCE.driver.get();
    }

    public static void release() {
        INSTANCE.driver.get().quit();
        INSTANCE.driver.remove();
    }
}
