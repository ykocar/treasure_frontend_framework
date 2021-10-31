package com.treasure.pages;

import com.treasure.utilities.BrowserUtils;
import com.treasure.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".user-avatar.no-border>div")
    public WebElement userMenuBttn;

    @FindBy(xpath = "//span[text()='Logout']")
    public WebElement logoutBtn;

    @FindBy(css = ".toolbar-right>button")
    public WebElement plusBttn;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div/input[1]")
    public WebElement uploadFilesBttn;

    @FindBy(xpath = "//div//div//div[2]/div//div//table/tbody/tr/td[1]")
    public WebElement selectItem;

    @FindBy(xpath = "/html/body/div[2]//mat-dialog-container/app-progress-dialog/div[1]/div[1]/div[1]")
    public WebElement uploadMessage;

    @FindBy(xpath = "/html//div[2]/button[3]/span[1]/span")
    public WebElement downloadBttn;

    @FindBy(xpath = "/html/body/div[2]//mat-dialog-container/app-progress-dialog/div[1]/div[1]/div[1]")
    public WebElement downloadMessage;




}
