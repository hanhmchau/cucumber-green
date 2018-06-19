## In an ideal world, CUSTOMERS write me
#Feature: Withdraw money
#  As a customer I want to withdraw money from an ATM so I don't have to go to the bank
#
#  Background:
#    Given I have an account
#
#  # What does this look like? Preconditions, trigger, normal flow, postconditions?
#  Scenario Outline: Withdraw money
#    Given I have <Balance> USD in my account
#    When I withdraw <Withdraw Amount> USD
#    Then I get told "<Message>"
#    And My account has <Remainder> USD
#
#    Scenarios:
#      | Balance | Withdraw Amount | Message | Remainder |
#      |    50   |              30 | Okay!   |        20 |
#      |    50   |              80 | No!     |        50 |
#      |    50   |              50 | Okay!   |         0 |
