package com.janitri.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By userIdField = By.id("userId");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login");
    private By eyeIcon = By.className("toggle-password");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoginButtonEnabled() {
        return driver.findElement(loginButton).isEnabled();
    }

    public boolean isPasswordMasked() {
        String type = driver.findElement(passwordField).getAttribute("type");
        return type.equals("password");
    }

    public void togglePasswordVisibility() {
        driver.findElement(eyeIcon).click();
    }

    public void enterUserId(String userId) {
        driver.findElement(userIdField).sendKeys(userId);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.getPageSource().contains("Invalid credentials");
    }

    public boolean arePageElementsPresent() {
        return driver.findElement(userIdField).isDisplayed() &&
               driver.findElement(passwordField).isDisplayed() &&
               driver.findElement(loginButton).isDisplayed() &&
               driver.findElement(eyeIcon).isDisplayed();
    }
}
