package com.ait.qa34.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class webshop_test_hw1 {
    WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByTageName(){
        WebElement element_h2 = driver.findElement(By.tagName("h2"));
        System.out.println(element_h2.getText());
        WebElement element_h3 = driver.findElement(By.tagName("h3"));
        System.out.println(element_h3.getText());
        WebElement element_li = driver.findElement(By.tagName("li"));
        System.out.println(element_li.getText());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}


