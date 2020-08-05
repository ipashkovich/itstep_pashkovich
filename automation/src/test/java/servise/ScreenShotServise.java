package servise;

import driver.DriverSingleton;
import io.qameta.allure.Attachment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotServise {
    static Logger log = LogManager.getRootLogger();

    @Attachment
    public static byte[] saveScreenshot() {
        log.error("make screenshot");
        return ((TakesScreenshot) DriverSingleton.getDriver()).getScreenshotAs(OutputType.BYTES);
    }
}
