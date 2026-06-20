package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    //add throws  to use thread sleep 2 second
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://www.saucedemo.com");

        WebElement userbox = driver.findElement(By.id("user-name"));
        userbox.sendKeys("standard_user");

        WebElement passbox = driver.findElement(By.id("password"));
        passbox.sendKeys("secret_sauce");
        Thread.sleep(2000);

        WebElement loginbox = driver.findElement(By.id("login-button"));
        loginbox.click();

        Thread.sleep(6000);

        WebElement addcart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addcart.click();
        Thread.sleep(3000);

        WebElement shopcart = driver.findElement(By.id("shopping_cart_container"));
        shopcart.click();
        Thread.sleep(3000);

        WebElement checkoutbox = driver.findElement(By.id("checkout"));
        checkoutbox.click();
        Thread.sleep(3000);

        WebElement firstbox = driver.findElement(By.id("first-name"));
        firstbox.sendKeys("leila");


        WebElement lastbox = driver.findElement(By.id("last-name"));
        lastbox.sendKeys("lahmidi");
       ;

        WebElement postalbox = driver.findElement(By.id("postal-code"));
        postalbox.sendKeys("8000");
        Thread.sleep(3000);

        WebElement continuebox = driver.findElement(By.id("continue"));
        continuebox.click();
        Thread.sleep(2000);

        WebElement finishbox = driver.findElement(By.id("finish"));
        finishbox.click();
        Thread.sleep(2000);

        WebElement backBox = driver.findElement(By.id("back-to-products"));
        backBox.click();

        Thread.sleep(4000);
        driver.quit();











        // 1. تشغيل محرك الكروم (هنا نستخدم الـ OOP!)
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//
//        // 2. أمر فتح المتصفح والذهاب لموقع جوجل
//        driver.get("https://www.google.com");
//
//        Thread.sleep(2000);
//
//        WebElement imagesLink = driver.findElement(By.linkText("Images"));
//        imagesLink.click();
//        Thread.sleep(10000);
//
//        WebElement imageSearchBox = driver.findElement(By.name("q"));
//        imageSearchBox.sendKeys("selenium webdriver");
//        Thread.sleep(10000);
//        imageSearchBox.submit();

//        // 3. طباعة عنوان الصفحة في الـ Console للتأكد
//        System.out.println("Page Title 1 is: " + driver.getTitle());

//        driver.navigate().to("https://www.amazon.com");
//
//        Thread.sleep(4000);// wait 4 second

        // 3. طباعة عنوان الصفحة في الـ Console للتأكد
//        System.out.println("Page Title 2 is: " + driver.getTitle());

//        driver.navigate().back();

//        Thread.sleep(2000);

//        WebElement searchBox= driver.findElement(By.name("q"));
//        searchBox.sendKeys("QA Automation java");
//        Thread.sleep(2000);
//        searchBox.submit();

        // 4. إغلاق المتصفح بعد الانتهاء
//        Thread.sleep(5000);
//        driver.quit();
    }
}
