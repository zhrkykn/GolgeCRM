Feature: Login features

  Scenario: Login login with valid credentials
    Given user enter valid credentials
    When user click submit for Login
    Then user should be able to see dashboard
