package com.janitri.tests;
import com.janitri.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginButtonDisabledWhenFieldAreEmpty() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertFalse(loginPage.isLoginButtonEnabled());
    }

    @Test
    public void testPasswordMaskedbutton() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.isPasswordMasked());
        loginPage.togglePasswordVisibility();
        Assert.assertFalse(loginPage.isPasswordMasked());
    }

    @Test
    public void testInvalidLoginShowErrorMsg() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserId("invalid@example.com");
        loginPage.enterPassword("wrongpassword");
        loginPage.clickLogin();
        Assert.assertTrue(loginPage.isErrorMessageDisplayed());
    }

    @Test
    public void testPageElementsPresent() {
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.arePageElementsPresent());
    }
}
