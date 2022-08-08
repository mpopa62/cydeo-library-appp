Feature: Adding book
  User Story: As a librarian, I should be able to add book

  @AC1 @US3 @P1
    Scenario: As a librarian, I should be able to add book
    Given librarian is on the homePage
    When librarian click Books module
    And librarian clicks "+Add Book" button
    When librarian enters BookName, ISBN, Year, Author, and Description
    And librarian clicks save changes
    Then verify a new book is added