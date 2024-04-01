package com.ait.qa34.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class selenium_test1 {
    WebDriver driver;
    // before - setUp (preCondition)
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        //driver.get("https://www.google.com"); // without history
        driver.navigate().to("https://www.google.com"); // with history
        driver.navigate().back();   // возвращает обратно в браузер
        driver.navigate().forward(); //
        driver.navigate().refresh(); // обновление
    }

    // test - name (openGoogle)
    @Test
    public void openGoogleTest(){
        System.out.println("Google is opened!");
    }
    // after - tearDown (закрывает браузер), (postCondition)
    @AfterMethod(enabled = true)
    public void tearDown(){
        driver.quit();  // close browser (all tabs)
        //  driver.close();// close only one tab (if onle one -> close browser)
    }


}
