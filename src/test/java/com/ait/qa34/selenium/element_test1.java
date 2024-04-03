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
        WebElement element_h1 = driver.findElement(By.tagName("h1")); // By.tagName("h1") - strategy, "h1" - locator
        System.out.println(element_h1.getText());
        // find list of elements by tag name
        WebElement element2a = driver.findElement(By.tagName("a"));
        System.out.println(element2a.getText());

        List<WebElement> element_a = driver.findElements(By.tagName("a"));
        System.out.println(element_a.size());


    }

    @Test

    public void findElementByLocators(){
        //id
        driver.findElement(By.id("city"));
        //class_name
        driver.findElement(By.className("input-container"));
        //name By.name("user");
        //link_text
        driver.findElement(By.linkText("Let the car work"));
        //partial_link_text - very rarely!!!
        driver.findElement(By.partialLinkText("work"));

    }
    //  css_selector
    @Test

    public void findElementByCssSelector(){
        //tag name = tag name
        driver.findElement(By.cssSelector("h1"));
        //id -> #id
        //driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#city"));
        //class name -> .className
        //driver.findElement(By.className("input-container"));
        driver.findElement(By.cssSelector(".input-container"));
        //"[name='user']"
        driver.findElement(By.cssSelector("[for='city']"));
        driver.findElement(By.cssSelector("[href='/search']"));
        //contains -> *
        driver.findElement(By.cssSelector("[href*='car']"));
        //start -> ^
        driver.findElement(By.cssSelector("[href^='/let']"));
        //end on -> $
        driver.findElement(By.cssSelector("[href$='work']"));
    }

    //  xPath //*[@attr='value'] * - find everywhere

    @Test

    public void findElementByXpath(){
        //tag name = //tag
        // find element by tage name
        driver.findElement(By.xpath("//h1"));   //  always //
        //id -> #id
        //driver.findElement(By.id("city"));
        driver.findElement(By.xpath("//*[@id='city']"));
        //class name -> //tag[@class='className']
        //driver.findElement(By.className("input-container"));
        driver.findElement(By.xpath("//*[@class='input-container']"));
        //contains -> //*[contains(@attr,'text')]
        //driver.findElement(By.cssSelector("[href*='car']"));
        driver.findElement(By.xpath("//*[contains(@href,'car')]"));
        //start -> //*[start-with(@attr,'....')]
        //driver.findElement(By.cssSelector("[href^='/let']"));
        driver.findElement(By.xpath("//*[starts-with(@href,'/let')]"));
        //text
        driver.findElement(By.xpath("//span[text()=' Never mistaken for anything else ']"));
        driver.findElement(By.xpath("//span[.=' Never mistaken for anything else ']"));
        driver.findElement(By.xpath("//span[contains(.,'mistake')]"));
        // search of parent element - //input[@id='username']/..
        // //div/a - child - css = div>a
        // //div//a - any level child - css = div a
        //tag1[.tag2[@attr='value']]
        //*[@id='firstName' or @name='lastName']
        //*[@id='firstName' and @name='lastName']

    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
