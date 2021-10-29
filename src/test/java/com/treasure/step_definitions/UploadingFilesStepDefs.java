package com.treasure.step_definitions;

import com.treasure.pages.DashboardPage;
import com.treasure.utilities.BrowserUtils;
import com.treasure.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UploadingFilesStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @And("the user clicks Plus button")
    public void theUserClicksPlusButton() {

        BrowserUtils.waitFor(2);
        dashboardPage.plusBttn.click();
    }

    @And("the user clicks Upload Files button")
    public void theUserClicksUploadFilesButton() {

        BrowserUtils.waitFor(2);
        dashboardPage.uploadFilesBttn.click();
    }

    @And("the user uploads a file")
    public void theUserUploadsAFile() {

        dashboardPage.uploadFilesBttn.sendKeys("C:/Users/Nur/Desktop/TreasureCloud.txt");
    }

}
