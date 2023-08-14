Feature: American airline application

  @american
  Scenario: Verify user can can Search Flight on American Airlines
    Given User is on american airlines website
    When User click on button Continue with cookies
    And User click on oneway button
    And User enter below information
      | originAirport | destinationAirport |
      | LGW           | IAD                |
    And User selecet number of adults '2'
    And User select number of childern '3'
    And User select the date of departure '20/08/2023'
    And User click on search button
    And User should be able to see choose flight page
