package com.ait.qa34.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void clickOnLoginLink() {
        click(By.cssSelector("[href='/login']"));
    }

    public void feelLoginForm(User user) {
        type(By.id("Email"), user.getEmail());
        type(By.id("Password"), user.getPassword());
    }
    public void clickOnLoginButton(){
        click(By.cssSelector(".button-1.login-button"));
    }
    public void addItemToCart(){
        driver.findElement(By.cssSelector("[href='/141-inch-laptop']"));
        driver.findElement(By.cssSelector(".button-2.product-box-add-to-cart-button"));
        driver.findElement(By.cssSelector(".cart-label"));
    }

    public boolean isItemToCart(){
        if(isElementPresent(By.cssSelector("[href='/141-inch-laptop']"))) {
            driver.findElement(By.cssSelector("[href='/141-inch-laptop']"));
            return true;
        }
        return false;
    }

    public void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e){
            throw new RuntimeException();
        }
    }


}
