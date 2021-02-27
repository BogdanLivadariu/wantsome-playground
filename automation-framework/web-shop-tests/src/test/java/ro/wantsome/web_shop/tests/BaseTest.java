package ro.wantsome.web_shop.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ro.wantsome.common.ConfigUtil;
import ro.wantsome.framework_ui.driver.DriverFactory;

public abstract class BaseTest {
    @BeforeClass
    public void setup() {
        DriverFactory.getDriver().get(ConfigUtil.getCurrentConfig().getUiUrl());
    }

    @AfterClass
    public void teardown() {
        DriverFactory.release();
    }
}
