Feature: Product Management
  As a system user
  I want to be able to manage products
  So I can create, view, update, and delete products
@GetAllProduct
  Scenario: Get all product with valid data
    Given user is on the product list page endpoint
    When user requests the product list endpoint
    And i receive that the response code is 200 OK
    Then user should receive a list of products

  Scenario: Create New Product
    Given user is on the product POST page endpoint
    When a user makes a request with the POST method on the endpoint with post data
    Then the system responds with the status code 200
    And the post add new prodoct that was just created
@ProductById
  Scenario: Get all product by ID
    Given user is on the product list by ID page endpoint
    When user requests the product list by ID endpoint
    Then i receive that the response code is 200
    And user should receive a products by ID

  Scenario: Delete Product
    Given user wants to delete post data with valid ID
    When a user makes a request with the DELETE method on the endpoint
    Then the system gives a response with status code 200
    And post data with ID 11305 has been deleted

  Scenario: Assign a product rating
    Given user is on the page Endpoint
    When user selects makes a request with the POST method on the endpoint
    Then the product rating should be assign
    And the system responds with the status code 200 ok

  Scenario: Get Product Ratings
    Given user is on the product ratings page endpoint
    When user requests the product ratings endpoint
    Then user should receive a list of products ratings
    And i receive response code is 200 OK