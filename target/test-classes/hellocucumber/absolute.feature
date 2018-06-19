# I really should be written before we implement this feature
Feature: Get the absolute value of a number
  As a customer I want to get the absolute value of a number because negative numbers look bad

  Scenario: Get the absolute of a positive number
    Given I have a calculator
    When I want to get the absolute value of 5
    Then I get 5

  Scenario: Get the absolute of a negative number
    Given I have a calculator
    When I want to get the absolute value of -5
    Then I get 5

  Scenario: Get the absolute of 0
    Given I have a calculator
    When I want to get the absolute value of 0
    Then I get 0
