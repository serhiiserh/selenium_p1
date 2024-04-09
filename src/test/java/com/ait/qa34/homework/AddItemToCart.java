package com.ait.qa34.homework;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Homework
//В домашнем проекте создайте, пожалуйста, класс AddItemToCart и протестируйте добавления товара в корзину(не забудьте о предусловии, где следует залогиниться). Выберите второй товар на главной странице
public class AddItemToCart extends TestBase {

    @BeforeMethod
    public void loginToAccount() {
        clickOnLoginLink();
        feelLoginForm(new User()
                .setEmail("ecevarriahoma@gmail.com")
                .setPassword("ecevarriahoma1234$"));
        clickOnLoginButton();


    }

    @Test
    public void addItemToCartTest() {
        pause(500);
        addItemToCart();
        Assert.assertTrue(isItemToCart());
    }

}
