Feature: Withdrow

  @Withdrow
  Scenario Outline: To verify the withdrow functionlity.
    Given I have "<initial>" amount in a account.
    When I withdrow "<some>" amount in  existis account.
    Then I except "<update>" amount will have in the account.

    Examples: 
      | initial | some | update |
      |    2000 |  500 |   1500 |
      |    1000 |  800 |    200 |
