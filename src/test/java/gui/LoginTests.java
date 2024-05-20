package gui;

import com.skillo.POM.HomePage;
import com.skillo.POM.LoginPage;
import gui.base.BaseTest;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    public static final int WAIT = 2000;

    @Test
    public void verifyUserCanNavigateToLoginPageViaNavigationLoginButton(){
        HomePage homePage = new HomePage(super.driver);

        System.out.println("STEP 1: The user has open Skillo Homepage");
        homePage.openHomePage();
        sleepy(WAIT);

        System.out.println("STEP 2: The user has navigated to Login page");
        homePage.navigateToLoginPageViaClickOnNavigationLoginButton();
        sleepy(WAIT);

        System.out.println("STEP 3: The user has verified the login page is as per requirements");
        LoginPage loginPage = new LoginPage(super.driver);
        loginPage.clickOnLoginFormRegistrationLink();
        sleepy(WAIT);
    }
}
