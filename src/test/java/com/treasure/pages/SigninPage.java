package com.treasure.pages;

import com.treasure.utilities.BrowserUtils;
import com.treasure.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

    public SigninPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//*[@class='mat-button-wrapper'])[5]")
    public WebElement popup;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement email1;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password1;

    @FindBy(id = "signin-button")
    public WebElement signInBttn;

    @FindBy(css = ".mat-error.ng-tns-c259-1.ng-star-inserted")
    public WebElement errorEmailMessage;

    @FindBy(css = ".mat-error.ng-tns-c259-2.ng-star-inserted")
    public WebElement errorPasswordMessage;

    //method for valif credentials
    public void login(String email, String password) {
        email1.sendKeys(email);
        password1.sendKeys(password);
        signInBttn.click();
    }

    // method for invalid email (username) or password
    public void login1(String email2, String password2) {
        email1.sendKeys(email2);
        password1.sendKeys(password2);
        signInBttn.click();
    }

}
