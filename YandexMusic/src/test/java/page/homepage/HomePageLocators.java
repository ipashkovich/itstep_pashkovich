package page.homepage;

import org.openqa.selenium.By;

public class HomePageLocators {
    protected static final By ENTER_BUTTON = By.className("button__label");//By.xpath("/html/body/div[1]/div[6]/div/div[2]/a"); //By.className("button__label");
    //protected static final By OTHER_ACCOUNT_LINK = By.cssSelector("a.passp-auth-header-link:nth-child(2)");

    protected static final By USER_LOGIN = By.id("passp-field-login");
    protected static final By USER_PASSWORD = By.id("passp-field-passwd");


    protected static final By USER_ICON = By.xpath("/html/body/div[1]/div[6]/div/div[2]/span");
    protected static final By USER_LOGIN_SUCCESSFUL = By.xpath("//div[@class=\"multi-auth__user-name typo\"]");

    protected static final By ENTER_TO_PASSWORD_BUTTON = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[1]");

    protected static final By PASSWORD_BUTTON = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/form/div[3]/button");

}
