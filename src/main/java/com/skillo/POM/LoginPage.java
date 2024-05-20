package com.skillo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

//1-Static variables
    public static final String LOGIN_PAGE_URL = "http://training.skillo-bg.com:4300/users/login";

    private WebDriver driver;
    private WebDriverWait wait;


//2-Web elements (UI MAPPING)
    @FindBy (css = "p.h4")
    private WebElement loginPageHeaderTitle;
    @FindBy (id = "defaultLoginFormUsername")
    private WebElement usernameInputField;
    @FindBy (id = "defaultLoginFormPassword")
    private WebElement passwordInputField;
    @FindBy (xpath = "//span[contains(text(),'Remember me')]")
    private WebElement rememberMeLabelText;
    @FindBy (xpath = "//input[contains(@formcontrolname,'rememberMe')]")
    private WebElement rememberMeCheckBox;
    @FindBy (xpath = "#sign-in-button")
    private WebElement loginFormSubmitButton;
    @FindBy (xpath = "/html/body/app-root/div[2]/app-login/div/div/form/p[2]/a")
    private WebElement loginFormRegistrationLink;

//3-Constructor
    public LoginPage (WebDriver driver){

        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(7));
        //To Do: Initialize Page Factory Elements!
        PageFactory.initElements(driver, this);
    }

//4-User Actions
    public void clickOnLoginFormRegistrationLink(){
        waitAndClick(loginFormRegistrationLink);
    }

//5-Assertions

//6-Support verification methods
public void waitAndClick(WebElement el){

    wait.until(ExpectedConditions.visibilityOf(el));
    el.click();
    System.out.println("ACTION: The User has clicked on " + el);
}
}
