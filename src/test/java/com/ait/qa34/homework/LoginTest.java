package com.ait.qa34.homework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{

    @Test
    public void loginPositiveTest(){
        click(By.cssSelector("[href='/login']"));
        // enter email
        type(By.id("Email"), "ecevarriahoma@gmail.com");
        // enter password
        type(By.id("Password"), "ecevarriahoma1234$");
        click(By.cssSelector(".button-1.register-button"));

    }

}
