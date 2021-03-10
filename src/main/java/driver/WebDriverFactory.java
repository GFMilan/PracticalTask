package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
public class WebDriverFactory {
    public static WebDriver initDriver(BrowserName browserName) {
        WebDriver driver = null;
        switch (browserName) {
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case OPERA:
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            case SAFARI:
                WebDriverManager.chromiumdriver().setup();
                driver = new SafariDriver();
                break;

        }
        driver.manage().window().maximize();
        return driver;
    }


    public static WebDriver initDriver(){
        String browserName = System.getProperty("browserName");
        return initDriver(BrowserName.valueOf(browserName.toUpperCase()));
    }

}
