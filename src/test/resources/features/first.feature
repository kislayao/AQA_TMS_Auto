Feature: Initial test to study Cucumber

  Scenario: Simple test without body

  Scenario: Simple test with Given
    Given browser is opened

  Scenario: Simple test with Given and When
    Given browser is opened
    When login page is opened

  Scenario: Simple test with all the key words
    Given browser is opened
    When login page is opened
    Then username field is displayed

  Scenario: AND usage
    Given browser is opened
    And login page is opened
    Then username field is displayed
    And password field is displayed

  Scenario: But usage
    Given browser is opened
    And login page is opened
    Then username field is displayed
    But password field is not displayed