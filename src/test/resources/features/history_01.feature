Feature: Search the Hexacta page the information required


  Scenario Outline: Search the Hexacta page the information
    Given I visit the test page
    When I search in the application for a value with this information
      | ID   | search   | expectedResult   |
      | <ID> | <search> | <expectedResult> |
    Then I verify the information required for the successful case

    Examples:
      | ID | search    | expectedResult                                               |
      | 1  | Outsource | What not to do when working with an outsourced software team |