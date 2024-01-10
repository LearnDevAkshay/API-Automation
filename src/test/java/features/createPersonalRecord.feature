Feature: Execute API Requests


@PostRequest
Scenario: Create book record
  Given Add payload
  When user call the api with POST request
  Then user will get success response with status code 201
  And all the required details are present in response body