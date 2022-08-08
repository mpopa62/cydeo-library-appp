package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addNewUserStepDef {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait((Driver.getDriver()),10);


    @When("librarian clicks Users module")
    public void librarian_clicks_users_module() {
       loginPage.moduleUsers.click();
    }

    @And("librarian clicks {string} User button")
    public void librarian_clicks_user_button(String string) {
        loginPage.addUser.click();
    }

    @When("librarian enters full name, password, email and address")
    public void librarian_enters_full_name_password_email_and_address() {
        loginPage.fullName.sendKeys("John Smith");
        loginPage.addUserPassword.sendKeys("1234");
        loginPage.addUserEmail.sendKeys("johnsmith@gmail.com");
        loginPage.addUserAddress.sendKeys("123 Lake Ave");
    }


    @Then("verify a new user is created")
    public void verify_a_new_user_is_created() {
        Assert.assertTrue(loginPage.fullName.isDisplayed());


    }
}
