Feature: As a track driver navigation on the Vytrack Fleet Module.
  User Story: As a truck driver, user should be able to access all vehicle information
  grid under the Fleet module.

  @driven
  Scenario: Login as track driver
    Given user is on the Vytrack login page
    When user enters track driver username user4
    And user enters track driver password "UserUser123"
    Then user should see Fleet module

  @driven
  Scenario: Access to all Vehicle information grid
    Given user is on the Fleet Management page
    When navigate to the Fleet option on top menu
    And navigate to the Vehicle dropdown option
    Then get all Vehicle information grid
