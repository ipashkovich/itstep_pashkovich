package tests;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.confirmationpage.ConfirmationPage;
import page.errormessagepage.ErrorMessagePage;
import page.signinpage.SigninPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {
    SigninPage signinPage;
    ConfirmationPage confirmationPage;
    ErrorMessagePage errorMessagePage;

    @BeforeMethod
    public void setup(){
        signinPage = new SigninPage();
        confirmationPage = new ConfirmationPage();
        errorMessagePage = new ErrorMessagePage();
        signinPage.open();
        signinPage.clearLogin();
        signinPage.clearPassword();
    }
    @Step("Log in with valid user: \"demo\" and \"demo\"")
    @Test (description = "VALID USER", priority = 1)
    public void successfulLoginTest(){

        signinPage.insertLogin("demo");
        signinPage.insertPassword("demo");
        signinPage.clickLoginButton();
        assertTrue(confirmationPage.isDisplayed());
    }
    @Step("Log in with empty fields: ")
    @Test(description = "EMPTY FIELDS", priority = 2)
    public void emptyFieldsLoginTest() {
        signinPage.clickLoginButton();
        Assert.assertTrue(errorMessagePage.isDispalyed());
    }
    @AfterMethod
    public void tearDown(){
        super.tearDown();
        signinPage = null;
        confirmationPage = null;
        errorMessagePage = null;
    }
}
