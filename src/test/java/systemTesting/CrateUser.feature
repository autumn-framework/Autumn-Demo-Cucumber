@CreateUser
Feature: CreateUser

  @JiraId:ZephyrId-123 @sanity @smoke @regression @createUser
  Scenario Outline:ZephyrId-123: Create a single user with valid data
    Given Set Create User Api Request
    When Update the name value in the Request Body
    And Update the job value in the Request Body "<JOB>"
    Then Execute the Create User Api
    And validate the createUser api response status code "<RESPONSESTATUS>"
    And validate the job value of createUser api response "<JOB>"

    Examples:
      | JOB          | RESPONSESTATUS |
      | Test Manager | SUCCESS_200    |