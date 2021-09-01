Feature: login to facebook
  I want to login facebook

  @Facebook
  Scenario: login to facebook account
    Given launch to facebook account
    When i put user name and password
    And click login button
    Then I able to login facebook account
