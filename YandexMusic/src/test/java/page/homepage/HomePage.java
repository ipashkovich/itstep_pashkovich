package page.homepage;

import page.BasePage;

import static page.homepage.HomePageLocators.*;

public class HomePage extends BasePage {
    String pageUrl = "https://music.yandex.ru/home";

   public void EnterToAthorization(){
       clickButton(ENTER_BUTTON);
   }
    public void clearLogin(){
        lookForElement(USER_LOGIN).clear();
    }
    public void clearPassword(){
        lookForElement(USER_PASSWORD).clear();
    }

    public void insertLogin(String loginUser){
        lookForElement(USER_LOGIN).sendKeys(loginUser);
   }
    public void insertPassword(String passwordUser){
        lookForElement(USER_PASSWORD).sendKeys(passwordUser);
    }

    public void clickLoginButton(){
        clickButton(ENTER_TO_PASSWORD_BUTTON);
    }
    public void clickPasswordButton(){
        clickButton(PASSWORD_BUTTON);
    }
    public void clickIcon() {
        lookForElement(USER_ICON).click();
    }

     public String getLogin() {
        clickButton(USER_ICON);
        waitForElement(USER_LOGIN_SUCCESSFUL);
        return lookForElement(USER_LOGIN_SUCCESSFUL).getText();
    }

    public void open(){
        super.open(pageUrl);
    }
}
