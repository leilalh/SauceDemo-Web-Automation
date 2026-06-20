package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage {
    WebDriver driver;
    WebDriverWait wait;

    By addcartBox = By.id("add-to-cart-sauce-labs-backpack");
    By shopcartBox = By.id("shopping_cart_container");

    public InventoryPage (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public  void clickaddcartBox(){wait.until(ExpectedConditions.elementToBeClickable(addcartBox)).click();}
    public void clickshopcartBox(){wait.until(ExpectedConditions.elementToBeClickable(shopcartBox)).click();}


}
