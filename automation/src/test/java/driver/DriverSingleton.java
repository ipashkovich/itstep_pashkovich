package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import utils.WebDriverListener;

import java.util.concurrent.TimeUnit;

public class DriverSingleton {
    private static Logger log = LogManager.getRootLogger();
    private static EventFiringWebDriver driver;

    private DriverSingleton() {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            //System.setProperty("webdriver.chrome.driver", "\\WebDriver\\bin\\chromedriver.exe");
            //System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\automation\\src\\main\\resources\\chromedriver.exe");
            WebDriverManager.chromedriver().version("84.0.4147.30").arch32().setup();//("84.0.4103.39")
            driver = new EventFiringWebDriver(new ChromeDriver());
            driver.register(new WebDriverListener());
            setUpDriver();
            log.info("Installed of driver successfully.Driver "+ driver.getClass().getName());
        }
        return driver;
    }

    public static void setUpDriver() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
