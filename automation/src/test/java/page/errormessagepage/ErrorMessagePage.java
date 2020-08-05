package page.errormessagepage;
import page.BasePage;
import static page.errormessagepage.ErrorMessagePageLocators.ERROR_LOGIN_MESSAGE;

public class ErrorMessagePage extends BasePage{
    public boolean isDispalyed() {
        return lookForElement(ERROR_LOGIN_MESSAGE).isDisplayed();
    }

}
