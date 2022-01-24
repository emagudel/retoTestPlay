Feature: Search the testim.io page the information required about your dream journey to space


  Scenario Outline: Search the testim.io page the information your next destination Tayabamba
    Given I visit the test page
    When I search in the application for a value with this information of traveler
      | ID   | departing   | returning   | adults   | children   | expectedResult   |
      | <ID> | <departing> | <returning> | <adults> | <children> | <expectedResult> |
    Then I verify the information required for the successful case

    Examples:
      | ID | departing       | returning       | adults | children | expectedResult |
      | 1  | 23 January 2022 | 26 January 2022 | 2      | 1        | Tayabamba      |

  Scenario Outline: Search the testim.io page the information your next destination Saturno
    Given I visit the test page
    When I search in the application for a value with this information of traveler
      | ID   | departing   | returning   | adults   | children   | expectedResult   |
      | <ID> | <departing> | <returning> | <adults> | <children> | <expectedResult> |
    Then I verify the information required for the alternate case

    Examples:
      | ID | departing       | returning       | adults | children | expectedResult |
      | 2  | 26 January 2022 | 5 February 2022 | 2      | 4        | Saturno      |