package page;

import driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Waiters;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {
    static Logger log = LogManager.getRootLogger();
    private WebDriver driver = DriverSingleton.getDriver();

    protected WebElement lookForElement(By by){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver.findElement(by);
    }

    protected void waitForElement(By by) {
        Waiters.waitForElement(driver, by);
    }

    protected void waitForElementClickable(By by) {
        Waiters.waitForElementClickable(driver, by);
    }

    protected void clickButton(By by) {
        waitForElementClickable(by);
        lookForElement(by).click();
    }

    public void open(String pageUrl){
        driver.get(pageUrl);
        log.info("open: " + pageUrl);
    }
}
