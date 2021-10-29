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

        public BasePage(){
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(css = ".user-avatar.no-border>div")
        public WebElement userMenuBttn;

        @FindBy(xpath = "//span[text()='Logout']")
        public WebElement logoutBtn;

        @FindBy(css = ".toolbar-right>button")
        public WebElement plusBttn;

        @FindBy(xpath = "(//div[@class='title'])[1]")
        public WebElement uploadFilesBttn;

        @FindBy(xpath = "(//div[@class='file-list-table ng-tns-c375-13 ng-star-inserted")
        public WebElement hoverToItem;

        @FindBy(css = ".mat-checkbox-inner-container.mat-checkbox-inner-container-no-side-margin")
        public WebElement selectItem;






}
