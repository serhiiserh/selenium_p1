package com.ait.qa34.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class element_test1 {
    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        // wait for all elements on the site to load before starting the test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // неявное
    }

    @Test

    public void findElementByTageName(){
    // find element by tage name
        WebElement element_h1 = driver.findElement(By.tagName("h1"));
        System.out.println(element_h1.getText());
        // find list of elements by tag name
        WebElement element2a = driver.findElement(By.tagName("a"));
        System.out.println(element2a.getText());

        List<WebElement> element_a = driver.findElements(By.tagName("a"));
        System.out.println(element_a.size());


    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
