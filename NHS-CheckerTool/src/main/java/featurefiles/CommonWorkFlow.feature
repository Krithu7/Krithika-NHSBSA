Feature: CommonWorkFlow

  @CommonWorkFlow
  Scenario Outline: To test whether the users from Wales are able to get help or not through NHS Checker Tool
    Given user opens the browser "<browserType>" and enters the URL "<URL>" for the test case "<TCID>"
    Then clicks the start button
    Then the user selects the country Wales 
    And enters the DOB fields - date "<date>" month "<month>" and year "<year>" for the test case "<TCID>"
    And answers living status with partner "<partnerYesNo>" for the test case "<TCID>"
    And answers benefit or tax credit question "<benefitsYesNo>" for the test case "<TCID>"
    Then chooses suitable answer for Universal credit question "<universalCredit>" for the test case "<TCID>"
    And answers the Universal credit sub-question "<universalCreditSubQn>" for the test case "<TCID>"
    And answers Universal credit period take-home range related question "<takeHomeLessRangeYesNo>" for the test case "<TCID>"
    Then gets the result for the test case "<TCID>"

    Examples: 
      | TCID  | browserType | URL  | date | month | year | partnerYesNo |benefitsYesNo | universalCredit |universalCreditSubQn|takeHomeLessRangeYesNo|
      | NHS_001 | chrome | https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start | 07 | 07 | 1994| Yes|Yes|Yes|Yes|Yes|
