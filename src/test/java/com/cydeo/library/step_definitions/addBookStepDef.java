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

public class addBookStepDef{

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait((Driver.getDriver()),10);


    @Given("librarian is on the homePage")
    public void librarian_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
        loginPage.usernameInput.sendKeys("librarian22@library");
        loginPage.passwordInput.sendKeys("JUXl6dnx");
        loginPage.signinBtn.click();
        String expectedURL = "https://library2.cydeo.com/login.html";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);

    }
    @When("librarian click Books module")
    public void librarian_click_books_module() {
        loginPage.moduleBooks2.click();

    }
    @When("librarian clicks {string} button")
    public void librarian_clicks_button(String string) {
         loginPage.addBook.click();

    }
    @When("librarian enters BookName, ISBN, Year, Author, and Description")
    public void librarian_enters_book_name_isbn_year_author_and_description() {
        loginPage.bookName.sendKeys("Way of the Peaceful Warrior");
        loginPage.isbnNum.sendKeys("123-456-789");
        loginPage.year.sendKeys("1998");
        loginPage.author.sendKeys("Dan Millman");
        loginPage.description.sendKeys("fiction");

    }
    @When("librarian clicks save changes")
    public void librarian_clicks_save_changes() {
        loginPage.saveBtn.click();

    }
    @Then("verify a new book is added")
    public void verify_a_new_book_is_added() {
        Assert.assertTrue(loginPage.bookName.isDisplayed());

    }

}
