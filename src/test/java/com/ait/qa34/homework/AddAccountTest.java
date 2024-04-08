package com.ait.qa34.homework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;





public class AddAccountTest extends TestBase{

    @Test
    public void addAccountPositiveTest(){
        Random random = new Random();
        int i = random.nextInt(1000) + 1000;
        // click registration
        click(By.cssSelector("[href='/register']"));
        // click first name
        type(By.id("FirstName"), "Vasja");
        // click last name
        type(By.id("LastName"), "Vasilev");
        // click Email
        type(By.id("Email"), "vasjsav"  + i + "@gmail.com");
        // click password
        type(By.id("Password"), "Vasjasav$123");
        // click confirm password
        type(By.id("ConfirmPassword"), "Vasjasav$123");
        // assert account is added
        Assert.assertTrue(isElementPresent(By.id("register-button")));





    }

}
