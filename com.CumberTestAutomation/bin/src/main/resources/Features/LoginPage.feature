@Regression @LoginPage
Feature: Login Page 

  @LoginPage_User
  Scenario Outline: Login Page
  	Given Launch the Browser
    Then Validate the launched Url
    And Click on Login button 
    Then Enter the "<Username>" and "<Password>"
    And Close the Browser

    Examples: 
      | Username | Password |
      | TestUser | Pass0123 |
