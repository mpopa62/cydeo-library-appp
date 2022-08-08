Feature: Adding new user
  User Story: As a librarian, I should be able to add a new user

  @AC1 @US2 @P1
  Scenario: As a librarian, I should be able to add a new user
    Given librarian is on the homePage
    When librarian clicks Users module
    And librarian clicks "+Add" User button
    When librarian enters full name, password, email and address
    And librarian clicks save changes
    Then verify a new user is created