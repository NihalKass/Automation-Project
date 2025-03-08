@Regression @HomePage
Feature: Home Page elements validations

  @HomePage_RadioButtonVal
  Scenario: Home Page Radio button validation
    Given Launch the Browser
    Then Validate the launched Url
    And Click on button "RadioButton1"

  @HomePage_Textboxval
  Scenario Outline: Home Page textbox validation
    #Given Launch the Browser
    #Then Validate the launched Url
    And Validate textbox field "<FieldHeader>" and Enter "<Value>"

    Examples: 
      | FieldHeader              | Value    |
      | Suggession Class Example | testdata |

  @HomePage_Dropdown&CheckboxVal
  Scenario Outline: Home Page dropdown and checkbox validations
    #Given Launch the Browser
    #Then Validate the launched Url
    Then Validate dropdown field "Values" and select "value2"
    Then Validate checkbox field "Options" and select "option2"

  @HomePage_SwitchWindowsCheck
  Scenario Outline: Home Page switch windows validation
    #Given Launch the Browser
    #Then Validate the launched Url
    Then Click on "Open Window" to switch window
    Then Switch Window to original

  @HomePage_SwitchTabCheck
  Scenario Outline: Home Page switch tab validation
    #Given Launch the Browser
    #Then Validate the launched Url
    Then Click on "Open Tab" to move to other tab
    Then Switch the tab to original

  @HomePage_AlertMessageCheck
  Scenario Outline: Home Page Alert Message validation
    #Given Launch the Browser
    #Then Validate the launched Url
    Then Click on "Alert" button to validate "alertMessage"

  @HomePage_TableDataVal&StoreinExcel
  Scenario Outline: Home Page table data and store data in excel
    #Given Launch the Browser
    #Then Validate the launched Url
    And Validate All elements in the table1
    Then Store all data of the table in the excel sheet

  @HomePage_Table2withSumcheck
  Scenario Outline: Home Page table2 and sum validation
    #Given Launch the Browser
    #Then Validate the launched Url
    Then Validate table2 and verify sum amount matched with total

  @HomePage_MouseHoverCheck
  Scenario Outline: Home Page values on mouse hover validation
    #Given Launch the Browser
    #Then Validate the launched Url
    Then Validate "values" when mouse hover on "Mouse Hover"

  @HomePage_IFrameValidation
  Scenario Outline: Home Page Hyperlink redirect to iFrame validation
    #Given Launch the Browser
    #Then Validate the launched Url
    Then Validate "Hyperlink" on iFrame
    And Close the Browser
