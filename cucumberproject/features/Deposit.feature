Feature: Deposit

  @Deposit
  Scenario Outline: To verify the deposit functionlity.
    Given I have "<initial>" amount in my account.
    When I deposit "<some>" amount in my existis account.
    Then I except "<update>" amount will have in my account.

    Examples: 
      | initial | some | update |
      |     2000 |    500 |    2000 |
      |     100 |    800 |    900 |