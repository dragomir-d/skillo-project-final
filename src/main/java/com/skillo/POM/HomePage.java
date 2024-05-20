package com.skillo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

//1-Static variables
    private WebDriver driver;
    private WebDriverWait wait;
    public static final String HOME_PAGE_URL = "http://training.skillo-bg.com:4300/posts/all";

//2-Web elements (UI MAPPING)
    @FindBy (id = "nav-link-login")
    private WebElement navigationLoginButton;

//3-Constructor
    public HomePage (WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(7));
        //To Do: Initialize Page Factory Elements!
        PageFactory.initElements(driver, this);
    }

//4-User Actions
    public void openHomePage (){

        this.driver.get(HOME_PAGE_URL);
        wait.until(ExpectedConditions.urlContains(HOME_PAGE_URL));
    }

    public void navigateToLoginPageViaClickOnNavigationLoginButton(){
        waitAndClick(navigationLoginButton);
    }

//5-Assertions

//6-Support verification methods
    public void waitAndClick(WebElement el){

        wait.until(ExpectedConditions.visibilityOf(el));
        el.click();
        System.out.println("ACTION: The User has clicked on " + el);
    }

}
