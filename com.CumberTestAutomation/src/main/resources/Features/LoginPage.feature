@Regression @LoginPage
Feature: Login Page 

  @LoginPage_User
  Scenario Outline: Login Page
  	Given Launch the Browser
    Then Validate the launched Url
    And Close the Browser

    Examples: 
      | Username | Password |
      | TestUser | Pass0123 |
