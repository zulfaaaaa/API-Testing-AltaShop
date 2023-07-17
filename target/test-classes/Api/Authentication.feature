Feature: Authentication
  As a user I want to register to be able to login and manage products

  Scenario: Register with valid data
    Given user is on Register page endpoint
    When user requests the Register endpoint
    Then user success Register status code response 200 ok

  @RegisterInvalidMethod
  Scenario: Register with invalid method
    Given user is on Register page endpoint invalid method
    When user requests the Register endpoint invalid method
    Then user success Register status code response 405 invalid method

  @RegisterInvalidEndpoint
  Scenario: Register with invalid endpoint
    Given user is on Register page endpoint invalid endpoint
    When user requests the Register endpoint invalid endpoint
    Then user success Register status code response 404 invalid endpoint

  @RegisterInvalidEndMeth
  Scenario: Register with invalid method and endpoint
    Given user is on Register page endpoint invalid method and endpoint
    When user requests the Register endpoint invalid method and endpoint
    Then user success Register status code response 404 invalid method and endpoint

  @Login
  Scenario: Login with valid data
    Given user is on Login page endpoint
    When user requests the Login endpoint
    Then user success Login status code response 200 ok

  @LoginInvalidMethod
  Scenario: Login with invalid method
    Given user is on Login page endpoint invalid method
    When user requests the Login endpoint invalid method
    Then user success Login status code response 405 ok invalid method

  @LoginInvalidEndpoint
  Scenario: Login with invalid endpoint
    Given user is on Login page endpoint invalid endpoint
    When user requests the Login endpoint invalid endpoint
    Then user success Login status code response 404 invalid endpoint

  @LoginInvalidEndMeth
  Scenario: Login with invalid method and endpoint
    Given user is on Login page endpoint invalid method and endpoint
    When user requests the Login endpoint invalid method and endpoint
    Then user success Login status code response 404 invalid method and endpoint

  @GetUserInfo
  Scenario: Get User Information with valid data
    Given user have endpoint auth
    When user send endpoint auth
    When user has endpoint to get user information
    And user get user information
    Then User get user information status code 200
