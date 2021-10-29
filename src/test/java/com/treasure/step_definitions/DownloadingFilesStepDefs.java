package com.treasure.step_definitions;

import com.treasure.pages.DashboardPage;
import com.treasure.utilities.BrowserUtils;
import com.treasure.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;

public class DownloadingFilesStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @And("the user selects the file to be downloaded")
    public void theUserSelectsTheFileToBeDownloaded() {

        Actions actions = new Actions(Driver.get());
        actions.moveToElement(dashboardPage.hoverToItem).perform();

        dashboardPage.selectItem.click();
    }

    @And("the user clicks download tag")
    public void theUserClicksDownloadTag() {
    }
}
