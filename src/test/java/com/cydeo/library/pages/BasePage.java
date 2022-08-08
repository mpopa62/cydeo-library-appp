package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = about:blank
public abstract class BasePage {
    // No page elements added

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//span[.='Dashboard']")
    public WebElement dashboardLink;

    @FindBy(xpath="//span[.='Users']")
    public static WebElement usersLink;

    @FindBy(xpath="//span[.='Books']")
    public WebElement booksLink;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement userNameLink;

  /*@FindBy(xpath = "//span[.='Books']")
  public static WebElement moduleBooks;

    @FindBy(xpath = "//a[@href='#borrowing-books']")
    public static WebElement moduleBorrowingBooks;

    @FindBy(xpath = "//span[.='Dashboard']")
    public static WebElement moduleDashboard;

    @FindBy(xpath = "//span[.='Users']")
    public static WebElement moduleUsers;


    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public static WebElement errorLoginMsg;

    @FindBy(xpath = "//a[@href='#books']")
    public static WebElement moduleBooks2;
*/
}