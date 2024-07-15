@UI
Feature: I want to validate Items Present in HomePage

  @firstTestCase
  Scenario: User Verify Items Present in HomePage Smoke
    Given User has Launched Application
    When User Login to Application with below credentials
      | UserName      | Password     |
      | standard_user | secret_sauce |
    And User has clicked login button
    Then User Verify the Items Count
    Then User can close the Browser


    @secondTestCase
  Scenario: User Verify the Add to Cart Options is Available
    Given User has Launched Application
    When User Login to Application with below credentials
      | UserName      | Password     |
      | standard_user | secret_sauce |
    And User has clicked login button
    Then User Verify the Home Page Title
    Then User can close the Browser

