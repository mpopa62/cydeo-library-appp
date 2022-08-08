
Feature: login feature
  User Story: As user I should be able to login to library

  @AC1 @US1 @P1
  Scenario: As a librarian, I should be able to login to library
    Given librarian is on the Login Page
    Then verify that the title is Login - Library
    When librarian enters valid email address, "librarian22@library", and password, "JUXl6dnx"
    And librarian click sign in button
    Then verify that there are three modules on the page


    @AC2 @US1 @P1
    Scenario: As a student, I should be able to login to library
      Given  student is on the loginPage
      Then verify that the URL is "https://library2.cybertekschool.com/login/html"
      When student enters valid email address, "student55@library", and password, "xBLy3ufr"
      And student clicks sign in button
      Then verify that there are two modules on the page

     @AC3 @US1 @P1
      Scenario: Negative login functionality
        Given user is on the loginPage
        When user enters invalid email "invalidemail@invalid.com" address or password "invalidpassword"
        And student clicks on sign in button
        Then verify the error message "Sorry, Wrong Email or Password"

