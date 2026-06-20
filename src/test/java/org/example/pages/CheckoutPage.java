package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;

    By checkoutbutton = By.id("checkout");
    By firstnamebox = By.id("first-name");
    By lastnamebox = By.id("last-name");
    By postalcodebox = By.id("postal-code");
    By continuebutton = By.id("continue");
    By finishbuton = By.id("finish");
    By succesmessage = By.className("complete-header");
    By backtoproducts = By.id("back-to-products");

    public CheckoutPage(WebDriver driver, WebDriverWait wait){this.driver = driver; this.wait = wait;}

    public void clickcheckout (){wait.until(ExpectedConditions.elementToBeClickable(checkoutbutton)).click();}
    public void filliginformations(String firstname, String lastname, String posatlcodee ){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstnamebox)).sendKeys(firstname);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastnamebox)).sendKeys(lastname);
        wait.until(ExpectedConditions.visibilityOfElementLocated(postalcodebox)).sendKeys(posatlcodee);

    }
    public void clickcontinuebutton(){wait.until(ExpectedConditions.elementToBeClickable(continuebutton)).click();}
    public void clickfinishbuton(){wait.until(ExpectedConditions.elementToBeClickable(finishbuton)).click();}
    public String getsuccesmessageText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(succesmessage)).getText();
    }
    public void clickbacktpprodcut(){
        wait.until(ExpectedConditions.elementToBeClickable(backtoproducts)).click();
    }


}
