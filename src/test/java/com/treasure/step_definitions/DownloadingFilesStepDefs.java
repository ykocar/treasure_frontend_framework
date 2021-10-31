package com.treasure.step_definitions;

import com.treasure.pages.DashboardPage;
import com.treasure.utilities.BrowserUtils;
import com.treasure.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class DownloadingFilesStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @And("the user selects the file to be downloaded")
    public void theUserSelectsTheFileToBeDownloaded() {

        dashboardPage.selectItem.click();
    }

    @And("the user clicks download tag")
    public void theUserClicksDownloadTag() {

        dashboardPage.downloadBttn.click();

        BrowserUtils.waitFor(3);
    }

    @Then("the user sees the download message")
    public void theUserSeesTheDownloadMessage() {

        String expectedDownloadMessage = "All downloads finished";

        String actualDownloadMessage = dashboardPage.downloadMessage.getText();

        System.out.println("actualDownloadMessage = " + actualDownloadMessage);
        Assert.assertEquals(expectedDownloadMessage, actualDownloadMessage);


    }
}
