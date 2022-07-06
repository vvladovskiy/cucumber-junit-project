Feature: As a track driver navigation on the Vytrack Fleet Module.
  User Story: As a truck driver, user should be able to access all vehicle information
  grid under the Fleet module.

  @driven1
  Scenario: Login as track driver
    Given user is on the vytrack login page
    When user enters track driver username "user4"
    And user enters track driver password "UserUser123"
    And user click SignIn button
    #Then user should see fleet module

  @driven2
  Scenario: Access to all Vehicle information grid
    Given user is on the fleet management page
    When navigate to the fleet option on top menu
    And navigate to the vehicle dropdown option
    Then get all vehicle information grid
