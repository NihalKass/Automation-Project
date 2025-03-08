@Regression @LoginPage
Feature: Login Page

  @LoginPage_Loginwithpassword
  Scenario Outline: Login Page
    #Given Launch the Browser
    And Click on "HomeButton"
    Then Validate Login page redirected
    Then Click on "Login" button
    Then Click on link "Login with a password"
    Then Login with "Email" and password
    And Click on "Login" button

    Examples: 
      | Email               |
      | TestUser@mailinator |

  @LoginPage_LoginwithSecuritykey
  Scenario Outline: Login Page
    #Given Launch the Browser
    And Click on "HomeButton"
    Then Validate Login page redirected
    Then Click on "Login" button
    Then Click on link "Login with a password"
    Then Login with "Email" and security key sent on mailid
    And Click on "Login" button

    Examples: 
      | Email               |
      | TestUser@mailinator |
