Feature: I want to validate Items Present in HomePage

  @smoke
  Scenario: User Verify Items Present in HomePage smoke
    Given User has Launched Application
    When User Login to Application with below credentials
      | UserName      | Password     |
      | standard_user | secret_sauce |
    And User has clicked login button
    Then User Verify the Items Count
