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

    @Test
    public void findElementByCssSelector(){
        driver.findElement(By.cssSelector("strong"));
        driver.findElement(By.cssSelector("#bar-notification"));
        driver.findElement(By.cssSelector(".close"));
        driver.findElement(By.cssSelector(".ico-wishlist"));
        driver.findElement(By.cssSelector(".block.block-popular-tags"));
        driver.findElement(By.cssSelector("[title='Error']"));
        driver.findElement(By.cssSelector("[href='/login']"));
        //contains -> * (содержит)
        driver.findElement(By.cssSelector("[href*='apparel']"));
        //start -> ^ (в начале)
        driver.findElement(By.cssSelector("[href^='/gift']"));
        //end on -> $ (в конце)
        driver.findElement(By.cssSelector("[href$='cards']"));
        driver.findElement(By.cssSelector("[href$='shoes']"));
    }

    @Test
    public void findElementByXpath(){
        // xPath //*[@attr='value']
        // always with //
        driver.findElement(By.xpath("//strong"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));
        driver.findElement(By.xpath("//*[@class='close']"));
        driver.findElement(By.xpath("//*[@class='ico-wishlist']"));
        driver.findElement(By.xpath("//*[contains(@class, 'block') and contains(@class, 'block-popular-tags')]"));
        driver.findElement(By.xpath("//*[contains(.,'Error')]"));
        //., - just a text
        driver.findElement(By.xpath("//*[contains(@href,'/login')]"));
        driver.findElement(By.xpath("//*[contains(@href,'apparel')]"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/gift')]"));
        driver.findElement(By.xpath("//*[contains(.,'shoes')]"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}


