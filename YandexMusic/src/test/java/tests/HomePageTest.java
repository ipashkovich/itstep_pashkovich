package tests;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.homepage.HomePage;

public class HomePageTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void setup(){
        homePage = new HomePage();
        homePage.open();
    }

    @Step("Log in with valid user ")
    @Test (description = "VALID USER", priority = 1)
    public void successfulLoginTest(){
        homePage.EnterToAthorization();
       // homePage.clearLogin();
        homePage.insertLogin("stepTestUser");
        homePage.clickLoginButton();
        homePage.insertPassword("stepTestLogin");
        homePage.clickPasswordButton();
        homePage.clickIcon();
        Assert.assertEquals(homePage.getLogin(), "stepTestUser");
    }

    @AfterMethod
    public void tearDown(){
        super.tearDown();
        homePage = null;
    }
}
