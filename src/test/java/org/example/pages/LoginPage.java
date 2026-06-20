package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;

    By usernameBox = By.id("user-name");
    By passwordBox = By.id("password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    public void logininfos(String username, String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameBox)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordBox)).sendKeys(password);
    }

    public void clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }


}
