Feature: As a track driver navigation on the Vytrack Fleet Module.
  User Story: As a truck driver, user should be able to access all vehicle information
  grid under the Fleet module.

  @driven1
  Scenario Outline: Login as track driver
    Given user is on the vytrack login page
    When user enters track driver username <string>
    And user enters track driver password <string1>
    And user check mark field Remember me on this computer
    And user click SignIn button
    Then user should see fleet module page
    Examples:
      | string  | string1       |
      | "user4" | "UserUser123" |

  @driven2
  Scenario: Access to all Vehicle information grid
    Given user is on the fleet management page
    When navigate to the fleet option on top menu
    And navigate to the vehicle dropdown option
    Then get all vehicle information grid
