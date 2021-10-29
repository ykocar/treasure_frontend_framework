package com.treasure.step_definitions;

import com.treasure.pages.SigninPage;
import com.treasure.utilities.BrowserUtils;
import com.treasure.utilities.ConfigurationReader;
import com.treasure.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class Sign_inStepDefs {

    SigninPage signinPage = new SigninPage();

    @Given("the user is on the sign-in page")
    public void theUserIsOnTheSignInPage() {

        Driver.get().get(ConfigurationReader.get("url"));

        BrowserUtils.waitFor(2);

        signinPage.popup.click();

    }

    @When("the user signed in using {string} {string}")
    public void theUserSignedInUsing(String email, String password) {

        signinPage.login(email,password);

    }

    @Then("the user should be able to sign in")
    public void theUserShouldBeAbleToSignIn() {

        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Treasure - Treasure",actualTitle);
    }

    @When("the user logs in using {string} or {string}")
    public void theUserLogsInUsingOr(String email2, String password2) {
        signinPage.login1(email2,password2);

    }

    @Then("the user should not be able to login")
    public void theUserShouldNotBeAbleToLogin() {

        Assert.assertTrue(signinPage.errorEmailMessage.isDisplayed());
        Assert.assertTrue(signinPage.errorPasswordMessage.isDisplayed());
    }

    @And("User should see reset password on the login page")
    public void userShouldSeeResetPasswordOnTheLoginPage() {
    }
}
