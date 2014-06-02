@accessibility
Feature: Check how our site complies with accessibility recommendations

  Scenario Outline: Check how home page complies with accessibility recommendations
    Given I am on "http://www.bbc.co.uk"
    When I ask for "<report_type>" report
    Then I should see the accessibility report
    And I should take a screenshot

    Examples:
      | report_type                     |
      | Errors, Features, and Alerts    |
      | Text only                       |
      | Outline                         |
      | Structure / Order               |
