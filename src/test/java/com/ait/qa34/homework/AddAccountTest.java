package com.ait.qa34.homework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddAccountTest extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        click(By.cssSelector("[href='/login']"));
        // enter email
        type(By.id("Email"), "ecevarriahoma@gmail.com");
        // enter password
        type(By.id("Password"), "ecevarriahoma1234$");
        click(By.cssSelector(".button-1.register-button"));
    }

    @Test
    public void addAccountPositiveTest(){
        // click registration
        click(By.cssSelector("[href='/register']"));
        // click first name
        type(By.id("FirstName"), "Vasja");
        // click last name
        type(By.id("LastName"), "Vasilev");
        // click Email
        type(By.id("Email"), "vasjsav123@gmail.com");
        // click password
        type(By.id("Password"), "Vasjasav$123");
        // click confirm password
        type(By.id("ConfirmPassword"), "Vasjasav$123");
        // assert account is added
        Assert.assertTrue(isElementPresent(By.id("register-button")));





    }

}
