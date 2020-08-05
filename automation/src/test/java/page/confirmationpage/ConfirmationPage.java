package page.confirmationpage;

import page.BasePage;
import static page.confirmationpage.ConfirmPageLocators.CONFIRMATION_WINDOW;

public class ConfirmationPage extends BasePage {
    String pageUrl = "https://idemo.bspb.ru/auth/otp?authOptionId=SMS%3A10005";

    public boolean isDisplayed(){
        return lookForElement(CONFIRMATION_WINDOW).isDisplayed();
    }
    public void open(){
        super.open(pageUrl);
    }
}
