@smoke
Feature: josdem Test
  Scenario: Validates josdem website title
    Given Website as "https://josdem.io/"
    When I get title
    Then I validate is "josdem"