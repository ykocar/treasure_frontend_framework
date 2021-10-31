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

    @And("the user uploads a file")
    public void theUserUploadsAFile() {

        dashboardPage.uploadFilesBttn.sendKeys("C:\\Users\\Nur\\Desktop\\TreasureCloud.txt");

        BrowserUtils.waitFor(3);
    }

    @Then("the user sees the upload message")
    public void theUserSeesTheUploadMessage() {

        String expectedUploadMessage = "All uploads finished";

        String actualUploadMessage = dashboardPage.uploadMessage.getText();

        System.out.println("actualUploadMessage = " + actualUploadMessage);
        Assert.assertEquals(expectedUploadMessage, actualUploadMessage);


    }
}
