Feature: Product Categories Management
  As a system user
  I want to be able to manage product categories
  So I can create, view, update, and delete product categories

  @CreateNewProductCategories
  Scenario: Create New Product Categories
    Given user is on the product categories page with endpoint and POST method
    When a user makes a request with the POST method on the endpoint with post data for create new product categories
    Then the system responds with the status code 200 for create new product categories

  @GetAllProductCategories
  Scenario: Get all product categories with valid data
    Given user is on the product categories with endpoint and GET method
    When user requests the product categories list endpoint
    And i receive that the response code is 200 OK for get all product categories
    Then user should receive a list of product categories

  @GetProductCategoriesById
  Scenario: Get product categories by ID
    Given user is on the product categories list by ID page endpoint
    When user requests the product categories list by ID endpoint
    And user should receive a product Categories by ID
    Then user receive that the response code is 200 ok for get product categories by Id

  @DeleteCategories
  Scenario: Delete A Categories
    Given user wants to delete categories data with valid ID
    When a user makes a request with the DELETE method on the endpoint for delete categories id 13837
    Then the system gives a response status code 200 and categories data with ID 13837 has been deleted
