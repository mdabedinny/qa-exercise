package com.qaexercise;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Author - Md Abedin
 * Date - 12/03/2018
 */

public class DelCatPage {
    WebDriver driver;
    public DelCatPage(WebDriver driver){
        this.driver = driver;
    }
    By yesLink = By.xpath("//a[text()='Yes']");
    By neverMindLink = By.xpath("//a[text()='Nevermind']");

    public WebElement clickOnYesLink(){
        return driver.findElement(yesLink);
    }

    public WebElement clickOnNeverMindLink(){
        return driver.findElement(neverMindLink);
    }


}
