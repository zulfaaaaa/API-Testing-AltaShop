#Feature: Orders Management
#  As a system user
#  I want to be able to manage orders
#  So I can create and views orders
#
#  @CreateNewOrders
#  Scenario: Create New Orders With Valid Data
#    Given user is on the orders page with endpoint and POST method
#    When a user makes a request with the POST method on the endpoint for create new orders
#    Then the system responds with the status code 200 for create new orders
#
#  @GetAllOrders
#  Scenario: Get all product orders with valid data
#    Given user is on the orders with endpoint and GET method
#    When user requests the orders list endpoint
#    And i receive that the response code is 200 OK for get all orders
#    Then user should receive a list of all orders
#
#  @GetOrdersById
#  Scenario: Get Orders by ID
#    Given user is on the product categories list by ID page endpoint
#    When user requests the product categories list by ID endpoint
#    And user should receive a product Categories by ID
#    Then user receive that the response code is 200 ok for get product categories by Id
#
#
