package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://library2.cydeo.com/login.html
public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement usernameInput;

    @FindBy(id = "inputPassword")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement signinBtn;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement moduleBooks;

    @FindBy(xpath = "//a[@href='#borrowing-books']")
    public WebElement moduleBorrowingBooks;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement moduleDashboard;

    @FindBy(xpath = "//span[.='Users']")
    public WebElement moduleUsers;


    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement errorLoginMsg;

    @FindBy(xpath = "//a[@href='#books']")
    public WebElement moduleBooks2;


    @FindBy(xpath = "//i[@class='fa fa-plus']")
    public WebElement addBook;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement bookName;

    @FindBy(xpath = "//input[@name='isbn']")
    public WebElement isbnNum;

    @FindBy(xpath = "//input[@name='year']")
    public WebElement year;

    @FindBy(xpath = "//input[@name='author']")
    public WebElement author;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement description;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveBtn;

    @FindBy(xpath = "//td[.='Way of the Peaceful Warrior']")
    public WebElement bookSave;

    @FindBy(xpath = "//a[@href='tpl/add-user.html']")
    public WebElement addUser;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement addUserPassword;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement addUserEmail;

    @FindBy(xpath = "//textarea[@name='address']")
    public WebElement addUserAddress;

    public void login(String userName, String password){
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);

    }
}