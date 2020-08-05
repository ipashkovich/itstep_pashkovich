package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiters {
    public static void waitForElement(WebDriver driver, By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20), Duration.ofMillis(500));
        wait
                .withMessage("Find element" + element)
                .until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public static void waitForElementClickable(WebDriver driver, By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20), Duration.ofMillis(500));
        wait
                .withMessage("Can't click element" + element)
                .until(ExpectedConditions.elementToBeClickable(element));
    }
}