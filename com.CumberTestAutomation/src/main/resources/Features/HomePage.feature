@Regression @HomePage
Feature: Home Page elements validations

  @Test @HomePage_ElementsVal
  Scenario Outline: Home Page validations
    Given Launch the Browser
    Then Validate the launched Url
    #And verify elements under homepage
    And Click on button "RadioButton1"
    And Close the Browser
