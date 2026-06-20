package org.example.tests;

import org.example.pages.CheckoutPage;
import org.example.pages.InventoryPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.example.pages.LoginPage;


public class SauceDemoTest extends BaseTest{


    @Test
    public  void testsuccesful(){

        LoginPage loginPage = new LoginPage(driver, wait);
        loginPage.logininfos("standard_user", "secret_sauce");
        loginPage.clickLogin();


        //................................................................
        InventoryPage inventoryPage = new InventoryPage(driver, wait);
        inventoryPage.clickaddcartBox();
        inventoryPage.clickshopcartBox();

        //.............................................................

        CheckoutPage checkoutPage = new CheckoutPage(driver, wait);
        checkoutPage.clickcheckout();
        checkoutPage.filliginformations("leila","lahmidi","80000");
        checkoutPage.clickcontinuebutton();
        checkoutPage.clickfinishbuton();


        //.........Assert..................................


        String actualMessage = checkoutPage.getsuccesmessageText();
        String expectedMessage = "Thank you for your order!";

        Assert.assertEquals(actualMessage,expectedMessage);
        checkoutPage.clickbacktpprodcut();




    }



}
