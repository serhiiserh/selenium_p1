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

public class TableTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }

    @Test

    public void tableCssTest() {
        //get row8, last element
        WebElement canada = driver.findElement(By.cssSelector("tr:nth-child(8) td:last-child"));
        // берет текст
        System.out.println(canada.getText());
        System.out.println("========================================");
        WebElement row4 = driver.findElement(By.cssSelector("tr:nth-child(4)"));
        // печатает всю 4 строку
        System.out.println(row4.getText());
// get numbers of row
        List<WebElement> rows = driver.findElements(By.cssSelector("tr"));
        System.out.println(rows.size());
        for (WebElement element : rows) {
            System.out.println(element.getText());
        }
        System.out.println("=============================");
        for (int i = 0; i < rows.size(); i++) {
            System.out.println(rows.get(i).getText());
        }
    }

}
