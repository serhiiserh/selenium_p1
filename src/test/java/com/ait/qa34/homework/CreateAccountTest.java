package com.ait.qa34.homework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.Random;

public class CreateAccountTest extends TestBase {

    @Test

    public void createNewAccountPositiveTest() {
        Random random = new Random();
        int i = random.nextInt(1000) + 1000;
        // click on Login link
        click(By.cssSelector("[href='/login']"));
        // enter email
        type(By.id("Email"), "ecevarriahoma" + i + "@gmail.com");
        // enter password
        type(By.id("Password"), "ecevarriahoma1234$");
        // click Registration Button
        click(By.cssSelector(".button-1.register-button"));
        // assert Sigh Out Button is present
    }

}
