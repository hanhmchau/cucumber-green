# In an ideal world, CUSTOMERS write me
# I really should be written before we implement this feature
Feature: Withdraw money
  As a customer I want to withdraw money from an ATM so I don't have to go to the bank

  Background:
    Given I have an account

  # What does this look like? Preconditions, trigger, normal flow, postconditions?
  @okay
  Scenario: Withdraw less money than I have
    Given I have 50 USD in my account
    When I withdraw 30 USD
    Then I get told "Okay!"
    And My account has 20 USD

  @help
  Scenario: Withdraw more money than I have
    Given I have 50 USD in my account
    When I withdraw 80 USD
    Then I get told "No!"
    And My account has 50 USD

  @okay
  Scenario: Withdraw as much money as I have
    Given I have 50 USD in my account
    When I withdraw 50 USD
    Then I get told "Okay!"
    And My account has 0 USD
  # Why is everything so vague? Because implementation is prone to changes
  # And we want to capture the business, the domain logic
  # So we don't say "I input the number 50 in my text input, then I click my big red OK button"

  # In conclusion: These are "ingration tests" that test how modules work together, but don't test everything thoroughly

