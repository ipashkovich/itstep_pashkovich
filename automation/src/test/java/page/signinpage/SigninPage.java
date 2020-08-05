package page.signinpage;
import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import page.BasePage;
import static page.signinpage.SigninPageLocators.*;

public class SigninPage extends BasePage {
    static Logger log = LogManager.getRootLogger();
    String pageUrl = "https://idemo.bspb.ru/";

    public void clearLogin() {
        lookForElement(USERNAME_INPUT).clear();
        log.info(lookForElement(USERNAME_INPUT).getTagName() + " clear");
    }
    public void clearPassword() {
        lookForElement(PASSWORD_INPUT).clear();
        log.info(lookForElement(PASSWORD_INPUT).getTagName() + " clear");
    }

@Step("Insert login")
    public void insertLogin(String login){
        lookForElement(USERNAME_INPUT).sendKeys(login);
        log.info("Insert login " + login);
    }
    public void insertPassword(String passwordUser){
        lookForElement(PASSWORD_INPUT).sendKeys(passwordUser);
        log.info("Insert password " + passwordUser);
    }
    public void clickLoginButton(){
        lookForElement(LOGINBUTTON).click();
    }

    public void open(){
        super.open(pageUrl);
   }

}
