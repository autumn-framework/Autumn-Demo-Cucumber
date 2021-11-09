@GetUsers
Feature: GetUsers

  @JiraId:ZephyrId-124 @sanity @smoke @regression @getUsers
  Scenario Outline:ZephyrId-124: Get User Data
    Given Set Get Users Api Request "<PAGENUMBER>"
    Then Execute the Get User Api
    And validate the getuser api response status code "<RESPONSESTATUS>"

    Examples:
      | PAGENUMBER | RESPONSESTATUS |
      | 2          | SUCCESS_200    |