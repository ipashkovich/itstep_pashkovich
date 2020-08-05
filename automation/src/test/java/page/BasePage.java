package page;

import driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    static Logger log = LogManager.getRootLogger();
    private WebDriver driver = DriverSingleton.getDriver();

    public String getPageTitle(){
        return driver.getTitle();
    }

    protected WebElement lookForElement(By by){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver.findElement(by);
    }

    public void open(String pageUrl){
        driver.get(pageUrl);
        log.info("open: " + pageUrl);
    }

}
