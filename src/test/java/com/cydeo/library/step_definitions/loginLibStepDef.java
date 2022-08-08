package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.rules.MethodRule;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class loginLibStepDef {
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait((Driver.getDriver()),10);


    @Given("librarian is on the Login Page")
    public void librarian_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
        }


    @Then("verify that the title is Login - Library")
    public void verify_that_the_title_is_login_library() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Login - Library";
        Assert.assertEquals("Title verification failed", expectedTitle, actualTitle);


    }
    @When("librarian enters valid email address, {string}, and password, {string}")
    public void librarian_enters_valid_email_address_and_password(String string, String string2){
        loginPage.usernameInput.sendKeys("librarian22@library");
        loginPage.passwordInput.sendKeys("JUXl6dnx");

    }
    @When("librarian click sign in button")
    public void librarian_click_sign_in_button() {
        loginPage.signinBtn.click();

    }

    @Then("verify that there are three modules on the page")
    public void verify_that_there_are_three_modules_on_the_page() {
        Assert.assertTrue("Verification failed", loginPage.moduleDashboard.isDisplayed() && loginPage.moduleUsers.isDisplayed() && loginPage.moduleBooks2.isDisplayed());

    }


    @Given("student is on the loginPage")
    public void student_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
        }

    @Then("verify that the URL is {string}")
    public void verifyThatTheURLIs(String arg0) {
        String expectedURL = "https://library2.cybertekschool.com/login.html"; //correct URL https://library2.cydeo.com/login.htmlchange
        String actualURL = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals("URL verification failed", expectedURL, actualURL);
    }


    @When("student enters valid email address, {string}, and password, {string}")
    public void student_enters_valid_email_address_and_password(String username, String password) {
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);

    }

    @When("student clicks sign in button")
    public void student_clicks_sign_in_button() {
        loginPage.signinBtn.click();

    }

    @Then("verify that there are two modules on the page")
    public void verify_that_there_are_two_modules_on_the_page() {
        Assert.assertTrue("Verification failed", loginPage.moduleBooks.isDisplayed() && loginPage.moduleBorrowingBooks.isDisplayed());

    }

    @Given("user is on the loginPage")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
        }

    @When("user enters invalid email {string} address or password {string}")
    public void user_enters_invalid_email_address_or_password(String string, String string2) {
        loginPage.usernameInput.sendKeys("invalidemail@invalid.com");
        loginPage.passwordInput.sendKeys("invalidpassword");

    }

    @When("student clicks on sign in button")
    public void student_clicks_on_sign_in_button() {
        loginPage.signinBtn.click();

    }

    @Then("verify the error message {string}")
    public void verify_the_error_message(String string) {
        String expectedErrorMsg = "Sorry, Wrong Email or Password";
        Assert.assertEquals("Verification failed", expectedErrorMsg, loginPage.errorLoginMsg.getText());

    }

}

