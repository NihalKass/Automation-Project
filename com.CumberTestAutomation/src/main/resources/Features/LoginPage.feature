
Feature: Login Page


  @LoginPage
  Scenario Outline: Login Page
  	#Given Launch the Browser
    #Then Validate the launched Url
    #And Click on Login button
    #And verify elements under homepage
    And Click on button "RadioButton1" 
    Then Enter the "<Username>" and "<Password>"
    And Close the Browser

    Examples: 
      | Username | Password |
      | TestUser | Pass0123 |
