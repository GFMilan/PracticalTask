import driver.BrowserName;
import driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import constants.Constants;

import java.io.IOException;

public class BaseTestClass {
    protected WebDriver driver = null;

    @BeforeSuite
    public void beforeSuite() {
        driver = WebDriverFactory.initDriver(BrowserName.CHROME);
    }

    @AfterSuite
    public void afterSuite() {
        if (driver != null) {
            driver.quit();
        }
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public void goToUrl() {
        goToUrl(Constants.BASE_URL);
    }
}
