Feature: Validate Get Request

  @GetRequest
  Scenario: Fetch Product List
    When user call the product list API with GET request
    Then user will get success response from product list API with status code 200
    And all the required details are present in response body


