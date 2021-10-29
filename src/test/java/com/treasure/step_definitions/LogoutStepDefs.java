package com.treasure.step_definitions;

import com.treasure.pages.DashboardPage;
import com.treasure.utilities.BrowserUtils;
import com.treasure.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LogoutStepDefs {

    DashboardPage dashboardPage = new DashboardPage();

    @And("the user clicks usermenu button")
    public void theUserClicksUserMenuButton() {

        BrowserUtils.waitFor(2);
        dashboardPage.userMenuBttn.click();

    }

    @And("the user clicks logout on homepage")
    public void theUserClicksLogoutOnHomepage() {

        BrowserUtils.waitFor(2);
        dashboardPage.logoutBtn.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user is on the login page")
    public void theUserIsOnTheLoginPage() {

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Sign in - Treasure",actualTitle);
    }
}
